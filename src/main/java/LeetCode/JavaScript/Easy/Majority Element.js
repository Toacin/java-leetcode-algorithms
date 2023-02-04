let freqObj = {};

var majorityElement = function(nums) {
    let freqObj = {};

    for (number in nums) {
        if (isNaN(freqObj[number])) {
            freqObj[number] = 1;
        } else if (freqObj[number]>nums.length/2) {
            return number;
        } else {
            freqObj[number] += 1;
        }
    }

    console.log(freqObj);

    return -1;
};