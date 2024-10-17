function storingObjects(args) {
    let result = [];

    for (let objInput of args) {
        let input = objInput.split(" -> ");
        let name = input[0];
        let age = input[1];
        let grade = input[2];

        let usernameInfo = {};

        usernameInfo['name'] = name;
        usernameInfo['age'] = age;
        usernameInfo['grade'] = grade;

        result.push(usernameInfo);
    }
    for (let obj of result) {
        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Grade: ${obj.grade}`);
    }
}