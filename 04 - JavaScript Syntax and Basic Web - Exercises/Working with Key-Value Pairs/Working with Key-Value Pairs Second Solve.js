function workingWithKeyValuePairsSecondSolve(args) {
    let obj = {};

    for (let i = 0; i < args.length - 1; i++) {
     let tokens = args[i].split(" ");
     let key = tokens[0];
     let value = tokens[1];

     obj[key] = value;

    }
    let queryKey = args[args.length - 1];

    if (queryKey in obj) {
        console.log(obj[queryKey]);
    }
    else {
        console.log("None");
    }
}