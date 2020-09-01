const randomInt = function (min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

const getRandomCoords = function (t) {
    const {width, height} = t.getStageSize();
    return {x: randomInt(-width/2, width/2), y: randomInt(-height/2, height/2)};
}


const test_cat_says_text_when_touching_ball = async function (t) {
    await t.runForSteps(1); // wait for potential initialization

    const cat = t.getSprite('Katze');
    const ball = t.getSprite('Ball');

    const catTarget = cat.getScratchTarget();
    const ballTarget = ball.getScratchTarget();

    let state = 0;
    let state_enter_time = t.getRunTimeElapsed();

    let lastDragTime = t.getRunTimeElapsed();

    t.addCallback(() => {	
        // "Drag" ball to random position every 3s (because say is 2s)?
	if (t.getRunTimeElapsed() - lastDragTime > 3000) {
	    const pos = getRandomCoords(t);
	    ballTarget.setXY(pos.x, pos.y);
	    // Could also drag ball, but what's the advantage?
//	    t.inputImmediate({
//		device: 'drag',
//		sprite: ball,
//		x: randomInt(-200, 200),
//		y: randomInt(-200, 200)
//	    });
	    lastDragTime = t.getRunTimeElapsed();
        }
    });

    t.addCallback(() => {
        if (state == 0) {
            let touch = cat.isTouchingSprite(ball.name);

            if (touch) {
                state = 1;
                state_enter_time = t.getRunTimeElapsed();
            }
        } else if (state == 1) {
            let msg = cat.sayText.length > 0;

            if (msg) {
                state = 0;
                state_enter_time = t.getRunTimeElapsed();
            } else {
                if (t.getRunTimeElapsed() - state_enter_time > 1200) {
                    // Go to the error state
                    state = 2;
                    state_enter_time = t.getRunTimeElapsed();
                }
            }
    	}	
    });

    t.addConstraint(() => {
        t.assert.not(state == 2,
                    'Cat must say "Hab ich dich" or "Hab ich dich!" when touching the ball.');
    });

    t.setRandomInputInterval(150);
    t.detectRandomInputs({duration: [50, 100]});
    await t.runForTime(300000);

    t.end();
};

module.exports = [
    {
        test: test_cat_says_text_when_touching_ball,
        name: 'Cat says text when touching ball',
        description: 'Cat must say "Hab ich dich" or "Hab ich dich!" when touching the ball.'
            + ' We check if this condition is met for 300 seconds.'
    }
];
