function turnObjectIntoJSONString(args) {
    let personInfo = {};

    for (let obj of args) {
        let input = obj.split(" -> ");
        let key = input[0];
        let value = input[1];
        if (isFinite(value)) {
            value = Number(value);
        }

        personInfo[key] = value;
    }
    console.log(JSON.stringify(personInfo));
}