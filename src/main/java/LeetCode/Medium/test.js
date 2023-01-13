function StringPeriods(str) {

    // code goes here
    let longestSubString = "";
    for (let i = 0; i<str.length; i++) {
        longestSubString += str[i];
        console.log(i);

        // if ((str.length)%(longestSubString.length) !== 0) continue;

        let stringMatcher = "";
        // for (i=0; i<(str.length)/(longestSubString.length); i++) {
        //     stringMatcher += longestSubString;
        // }

        if (stringMatcher === str) return longestSubString;
    }
    return "-1";

}

// keep this function call here
console.log(StringPeriods("abcabc"));