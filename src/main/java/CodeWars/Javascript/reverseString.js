function solution(str) {
    let reversedString = "";
    for (let i=0; i<str.length; i++) {
        reversedString = str[i] + reversedString;
    }
    return reversedString;
}

console.log(solution("hello"));