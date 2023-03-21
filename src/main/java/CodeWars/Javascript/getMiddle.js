function getMiddle(s)
{
    if (s.length === 1 || s.length === 2) return s;

    let isEven = (s.length%2===0)
    if (isEven) {
        return s[(s.length/2)-1] + s[s.length/2];
    } else {
        return s[Math.floor(s.length/2)]
    }
}

console.log(getMiddle("testing"));