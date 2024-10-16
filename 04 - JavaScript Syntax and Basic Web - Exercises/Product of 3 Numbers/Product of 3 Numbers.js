function productOf3Numbers(arr) {
    let firstNumber = Number(arr[0]);
    let secondNumber = Number(arr[1]);
    let thirdNumber = Number(arr[2]);
    let result = "";
    let negativeCount = 0;

    if (firstNumber < 0) {
        negativeCount++;
    }
    if (secondNumber < 0) {
        negativeCount++;
    }
    if (thirdNumber < 0) {
        negativeCount++;
    }

    if (negativeCount == 0 ||
        negativeCount == 2) {
        result = "Positive"
    }
    else {
        result = "Negative"
    }

    console.log(result);
}