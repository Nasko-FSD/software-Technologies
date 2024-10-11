function solve([nums]) {
    nums = nums.split(' ').map(n => Number(n));

    if (nums[0] + nums[1] == nums[2]) {
        print(nums[0], nums[1], nums[2]);
    }
    else if (nums[1] + nums[2] == nums[0]) {
        print(nums[1], nums[2], nums[0]);
    } else if (nums[0] + nums[2] == nums[1]) {
        print(nums[0], nums[2], nums[1]);
    } else {
        console.log("No");
    }
}

function print(n1, n2, n3) {
    console.log(`${Math.min(n1, n2)} + ${Math.max(n1, n2)} = ${n3}`);
}