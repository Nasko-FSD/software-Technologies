function largest3Numbers(arr) {
    let nums = arr.map(Number);
    let largest3 = nums.sort((a, b) => b - a).slice(-3);
    for (let i = 0; i < largest3.length; i++) {
        console.log(nums[i]);
    }
}