function sumsByTown(arr) {
    let input = arr.map(line => JSON.parse(line));
    let towns = {};
    for (let obj of input) {
        if (obj.town in towns) {
            towns[obj.town] += obj.income;
        }
        else {
            towns[obj.town] = obj.income;
        }
    }
    let townNames = Object.keys(towns).sort();
    for (let town of townNames) {
        console.log(`${town} -> ${towns[town]}`);
    }
}