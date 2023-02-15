let testArray = ["shelby", "chelby", "thelby", "weatherby"];

function commonSuffix(inputArray) {
    let minLength = 10000;
    let shortestString = "";
    inputArray.forEach((string) => {
        if (string.length<minLength) {
            minLength=string.length;
            shortestString = string;
        }
    })

    let commonSuffix = "";
    for (let i=0; i<minLength; i++) {
        let noMatch = false;
        inputArray.forEach((string) => {
            if (string[string.length-1-i] !== shortestString[shortestString.length-1-i]) {
                noMatch = true;
            }
        })
        if (!noMatch) {
            commonSuffix = shortestString[shortestString.length-1-i] + commonSuffix;
        } else {
            break;
        }
    }

    console.log(commonSuffix);
}

commonSuffix(testArray);