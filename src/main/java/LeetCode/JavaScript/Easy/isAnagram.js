var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;

    const freqObj = {};

    s.split("").forEach((element) => {
        if (isNaN(freqObj[element])) freqObj[element] = 1;
        else freqObj[element] += 1;
    })

    let returnBoolean = true;
    t.split("").forEach((letter) => {
        if (!(Object.keys(freqObj).includes(letter)) || freqObj[letter] === 0) returnBoolean = false;
        freqObj[letter] -= 1;
    })

    return returnBoolean;
};

console.log(isAnagram("aaaa", "bbbb"));