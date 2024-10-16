function printNumbersInReversedOrder(arr) {
    let inputNumbers = arr.map(Number);
    debugger;

    for (let i = inputNumbers.length - 1; i >= 0; i--) {
        console.log(inputNumbers[i]);
    }
}

printNumbersInReversedOrder([
    "10",
    "15",
    "20"
])