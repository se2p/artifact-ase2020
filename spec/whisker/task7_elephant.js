const test_elephant_changes_costume = async function (t) {
    await t.runForSteps(1); // wait for potential initialization

    const elephant = t.getSprite('Elefant1');

    let lastChangeTime = t.getRunTimeElapsed();

    t.addCallback(() => {
        if (elephant.currentCostume !== elephant.old.currentCostume) {
            lastChangeTime = t.getRunTimeElapsed();
        }
    });

    t.addConstraint(() => {
        t.assert.less(t.getRunTimeElapsed() - lastChangeTime, 1200,
                'Elephant must change costume at least every 1.2 seconds.');
    });

    t.setRandomInputInterval(150);
    t.detectRandomInputs({duration: [50, 100]});
    await t.runForTime(300000);

    t.end();
};

module.exports = [
    {
        test: test_elephant_changes_costume,
        name: 'Elephant changes costumes',
        description: 'Elephant must change costume at least every 1.2 seconds.'
            + ' We check if this condition is met for 300 seconds.'
    }
];
