const stringToNumber = (str) => {
    let finalNum = 0;
    let multiplier = 1;

    for (let i=str.length-1; i>=0; i--) {
        finalNum = finalNum + (str[i]*multiplier);
        multiplier=multiplier*10;
    }

    return finalNum;
}

console.log(stringToNumber("908384"));