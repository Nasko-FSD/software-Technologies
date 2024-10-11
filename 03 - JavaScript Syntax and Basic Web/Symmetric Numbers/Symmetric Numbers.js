function symmetricNumbers([n]) {
    n = Number(n);

    for (let i = 1; i <= n; i++){
        let numberAsString = "" + i;
        if (numberAsString == [...numberAsString].reverse().join("")) {
            console.log(i);
        }
    }
}