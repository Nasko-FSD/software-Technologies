function multipleValuesForAKeySecondSolve(args) {
    let searchingKey = args.pop();
    let map = new Map();

    for (let searchingKeyElement of args) {
        let input = searchingKeyElement.split(" ");
        let key = input[0];
        let value = input[1];

        if (map.has(key) === false) {
            map.set(key, []);
        }
        map.get(key).push(value);
    }
    if (map.has(searchingKey)) {
        for (let mapElement of map.get(searchingKey)) {
            console.log(mapElement);
        }
    }
    else {
        console.log("None");
    }
}