function printLines(arr) {
    let printElements = [];
    for (let arrElement of arr) {
        if (arrElement === "Stop"){
            break;
        }
        else {
            printElements.push(arrElement);
        }
    }
    console.log(printElements.join('\n'));
}