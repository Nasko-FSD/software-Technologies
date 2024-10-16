function addAndRemoveElements(args) {
    let arr = [];
    for (let arrElement of args) {
        let input = arrElement.split(' ');
        let command = input[0];

        switch (command) {
            case "add":
            arr.push(input[1]);
                break;
            case "remove":
                let index = Number(input[1]);
                arr.splice(index, 1);
                break;
        }
    }
    console.log(arr.join('\n'));
}