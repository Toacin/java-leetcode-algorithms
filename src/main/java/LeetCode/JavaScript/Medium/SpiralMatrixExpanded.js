var spiralOrder = function(matrix) {
    const spiralArray = [];

    let horizontalMoves = matrix[0].length;
    let verticalMoves = matrix.length-1;
    let totalMoves = matrix.length*matrix[0].length;

    let xCoord = 0;
    let yCoord = 0;

    const directionArray = ["right", "down", "left", "up"];
    let directionIndex = 0;

    while(totalMoves) {
        let direction = directionArray[directionIndex];

        if (direction === "right") {
            for (let i=0; i<horizontalMoves; i++) {
                spiralArray.push(matrix[yCoord][xCoord]);
                xCoord++;
                totalMoves--;
            }
            xCoord--;
            horizontalMoves--;
            yCoord++;
        } else if (direction === "down") {
            for (let i=0; i<verticalMoves; i++) {
                spiralArray.push(matrix[yCoord][xCoord]);
                yCoord++;
                totalMoves--;
            }
            yCoord--;
            verticalMoves--;
            xCoord--;
        } else if (direction === "left") {
            for (let i=0; i<horizontalMoves; i++) {
                spiralArray.push(matrix[yCoord][xCoord]);
                xCoord--
                totalMoves--;
            }
            xCoord++;
            horizontalMoves--;
            yCoord--;
        } else {
            for (let i=0; i<verticalMoves; i++) {
                spiralArray.push(matrix[yCoord][xCoord]);
                yCoord--;
                totalMoves--;
            }
            yCoord++;
            verticalMoves--;
            xCoord++;
        }
        directionIndex = (directionIndex===3) ? 0 : directionIndex+1;
    }

    return spiralArray;
};