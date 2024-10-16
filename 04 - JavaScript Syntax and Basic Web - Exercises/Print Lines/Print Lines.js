function printLines(arr) {
    for (let arrElement of arr) {
        if (arrElement === "Stop"){
            break;
        }
        console.log(arrElement);
    }
}