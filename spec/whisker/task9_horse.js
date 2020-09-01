const test_horse = async function (t) {
    await t.runForSteps(1); // wait for potential initialization

    let horse = t.getSprite('Pferd');

    let lastRotateTime = t.getRunTimeElapsed();
    let lastColorChangeTime = t.getRunTimeElapsed();

    let lastMouseChangeTime = t.getRunTimeElapsed();
    let wasMouseTouching = horse.isTouchingMouse();

    t.addCallback(() => {
        if (horse.direction !== horse.old.direction) {
            lastRotateTime = t.getRunTimeElapsed();
        }
        if (horse.effects.color !== horse.old.effects.color) {
            lastColorChangeTime = t.getRunTimeElapsed();
        }
        if (wasMouseTouching !== horse.isTouchingMouse()) {
            wasMouseTouching = horse.isTouchingMouse();
            lastMouseChangeTime = t.getRunTimeElapsed();
        }
    }, true);

    t.addConstraint(() => {
        if (horse.isTouchingMouse() && t.getRunTimeElapsed() - lastMouseChangeTime >= 100) {
            t.assert.less(t.getRunTimeElapsed() - lastRotateTime, 100,
                    'Horse must rotate at least once a second when touching the mouse cursor.');
        }
    }, 'Rotate Constraint');

    t.addConstraint(() => {
        if (!horse.isTouchingMouse() && t.getRunTimeElapsed() - lastMouseChangeTime >= 100) {
            t.assert.less(t.getRunTimeElapsed() - lastColorChangeTime, 100,
                    'Horse must change color at least once a second when not touching the mouse cursor.');
        }
    }, 'Color Change Constraint');

    t.setRandomInputInterval(1000);
    t.detectRandomInputs();

    await t.runForTime(300000);

    t.end();
};

module.exports = [
    {
        test: test_horse,
        name: 'Horse rotates when touching mouse, changes color when not touching mouse',
        description: 'Horse must rotate at least once every 100 ms when touching the mouse cursor.'
                + ' Horse must change color at least once every 100 ms when not touching the mouse cursor.'
                + ' We check if this condition is met for 5 minutes while performing random inputs.'
    }
];
