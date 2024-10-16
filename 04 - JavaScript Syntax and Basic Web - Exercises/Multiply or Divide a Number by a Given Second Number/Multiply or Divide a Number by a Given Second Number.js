function multiplyOrDivideANumberByAGivenSecondNumber(arr) {
    let firstNumber = Number(arr[0]);
    debugger;
    let secondNumber = Number(arr[1]);
    let result = "";

    if (secondNumber >= firstNumber) {
        result = firstNumber*secondNumber;
    }
    else {
     result = firstNumber/secondNumber;
    }
    console.log(result);
}