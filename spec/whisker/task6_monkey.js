
const distance = function (x1, y1, x2, y2) {
    const xDist = x1 - x2;
    const yDist = y1 - y2;
    return Math.sqrt((xDist * xDist) + (yDist * yDist));
};

const randomInt = function (min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

const getRandomCoords = function (t) {
    const {width, height} = t.getStageSize();
    return {x: randomInt(-width/2, width/2), y: randomInt(-height/2, height/2)};
}

const test_director_chases_monkey = async function (t) {
    await t.runForSteps(1); // wait for potential initialization

    const monkey = t.getSprite('Affe');
    const director = t.getSprite('Zirkusdirektor-rennend');
    const directorTarget = director.getScratchTarget();
    const monkeyTarget = monkey.getScratchTarget();

    let lastMoveTowardsTime = t.getRunTimeElapsed();

    t.addCallback(() => {

	const currentDistance = distance(director.x, director.y, monkey.x, monkey.y);	
        const distanceFromNewPos = distance(director.x, director.y, monkey.x, monkey.y);
        const distanceFromOldPos = distance(director.old.x, director.old.y, monkey.x, monkey.y);
	if(currentDistance < 5 || (distanceFromOldPos > distanceFromNewPos)) {
            lastMoveTowardsTime = t.getRunTimeElapsed();
        }
    });

    t.addConstraint(() => {
        t.assert.less(t.getRunTimeElapsed() - lastMoveTowardsTime, 100,
                    'Director must move towards monkey at least once every 100ms.');
    });

    const dc = getRandomCoords(t);
    directorTarget.setXY(dc.x, dc.y);
    
    const mc = getRandomCoords(t);
    monkeyTarget.setXY(mc.x, mc.y);

    t.setRandomInputInterval(150);
    t.detectRandomInputs({duration: [50, 100]});
    await t.runForTime(300000);

    t.end();
};

module.exports = [
    {
        test: test_director_chases_monkey,
        name: 'Director chases monkey',
        description: 'Director must not move away from the monkey, unless they are at the same position.'
            + ' With a distance <= 5, we consider the director touching the monkey, eliminating the need to move.'
            + ' We check if this condition is met for 300 seconds.'
    }
];
