function workingWithKeyValuePairs(args) {
    let key = args.pop(); // Taking the last element
    let keyValue = {}; //object

    for (let obj of args) {
        let input = obj.split(" ");
        let key = input[0];
        let value = input[1];

        keyValue[key] = value;
    }
    if (keyValue.hasOwnProperty(key)) {  // Here is the different key than inner iter
        console.log(keyValue[key]);
    } else {
        console.log("None")
    }
}

workingWithKeyValuePairs([
    "key value",
    "key eulav",
    "test tset",
    "key"
])