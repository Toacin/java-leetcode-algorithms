var twoSum = function(nums, target) {
    nums.sort((a,b) => a-b);

    let lowIndex = 0;
    let highIndex = nums.length-1;
    let currentTotal = nums[highIndex] - nums[lowIndex];
    while(currentTotal !== target) {
        if (currentTotal>target) {
            highIndex--;
        } else {
            lowIndex++;
        }
        currentTotal = nums[highIndex] - nums[lowIndex];
    }
    return [lowIndex, highIndex];
};

console.log(twoSum([3, 5, 3, 9, 8, 5, 4, 4], 6));