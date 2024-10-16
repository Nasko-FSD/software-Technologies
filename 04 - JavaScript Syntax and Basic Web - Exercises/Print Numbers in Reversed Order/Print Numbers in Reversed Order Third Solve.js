function printNumbersInReversedOrderThirdSolve(arr){
    let inputNumbers = arr.map(Number);

    while (inputNumbers.length > 0)
    {
        console.log(inputNumbers.reverse().join('\n'));
        inputNumbers--;
    }
}