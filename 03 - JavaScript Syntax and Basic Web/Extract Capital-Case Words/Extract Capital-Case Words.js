function extractCapitalCaseWords(arr) {
    let text = arr.join(",");
    let words = text.split(/\W+/);
    let nonEmptyWords = words.filter(w => w.length > 0);
    let upWords = nonEmptyWords.filter(isUpperCase);

    function isUpperCase(str) {
        return str === str.toUpperCase();
    }
    return upWords.join(", ");
}