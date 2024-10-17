function multipleValuesForAKey(args) {
    let obj = {};
    let listWithValues = [];
    let searchingKey = args.pop();

    for (let i = 0; i < args.length; i++) {
        let tokens = args[i].split(" ");
        let key = tokens[0];
        let value = tokens[1];
        debugger;
        obj[key] = value;
        if (searchingKey === key) {
            listWithValues.push(value);
        }
    }
    if (searchingKey in obj) {
        console.log(listWithValues.join('\n'));
    }
    else {
        console.log("None");
    }
}