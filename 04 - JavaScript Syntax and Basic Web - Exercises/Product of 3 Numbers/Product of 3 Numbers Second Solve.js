function productOf3NumbersSecondSolve(arr) {
    let [x,y,z] = arr.map(Number);

    let negativeCount = 0;

    [x,y,z].forEach(e => {
        if (e < 0) {
            negativeCount++;
        }
    });

    if (negativeCount % 2 === 0) {
        console.log("Positive")
    }
    else {
        console.log("Negative")
    }
}