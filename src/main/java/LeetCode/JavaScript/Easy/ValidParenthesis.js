var isValid = function(s) {
    let stack = [];
    for (let i=0; i<s.length; i++) {
        let characterInQuestion = s[i];
        if (characterInQuestion === "(") stack.push(")");
        else if (characterInQuestion === "{") stack.push("}");
        else if (characterInQuestion === "[") stack.push("]");
        else {
            if (characterInQuestion !== stack.pop()) return false;
        }
    }
    return stack.length === 0;
};

console.log(isValid("()"));