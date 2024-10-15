function extractCapitalCaseWordsSecondSolve(arr) {
    let text = arr.join(",");
    let words = text.match(/\b[A-Z]+\b/g);

    return words.join(", ");
}