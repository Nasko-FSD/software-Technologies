function parseJSONObjects(args) {

    for (let input of args) {
        let obj = JSON.parse(input);

        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Date: ${obj.date}`);
    }
}