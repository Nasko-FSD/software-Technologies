function symmetricNumbersOnSingleRow([n]) {
    n = Number(n);

    let result = [];
    for (let i = 1; i <= n; i++){
        let numberAsString = "" + i;
        if (numberAsString == [...numberAsString].reverse().join("")) {
            result.push(i);
        }
    }
    console.log(result.join(" "));
}