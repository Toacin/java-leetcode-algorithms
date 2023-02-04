var addBinary = function(a, b) {
    const iterationLength = Math.max(a.length, b.length);

    let sum = "";
    let carry=false;
    for (let i=0; i<iterationLength; i++) {
        const aVal = ((a.length-1-i)>=0) ? a[a.length-1-i] : "0";
        const bVal = ((b.length-1-i)>=0) ? b[b.length-1-i] : "0";

        if (carry) {
            if ((aVal === "1" && bVal === "0") || (aVal === "0" && bVal === "1")) {
                sum = "0" + sum;
            } else if (aVal === "1" && bVal === "1") {
                sum = "1" + sum;
            } else {
                sum = "1" + sum;
                carry=false;
            }
        } else {
            if ((aVal === "1" && bVal === "0") || (aVal === "0" && bVal === "1")) {
                sum = "1" + sum;
            } else if (aVal === "1" && bVal === "1") {
                sum = "0" + sum;
                carry = true;
            } else {
                sum = "0" + sum;
            }
        }
    }

    return (carry) ? "1"+sum : sum;
};