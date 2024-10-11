function overload(){
    for (let i = 0; i < arguments.length; i++){
        console.log(arguments[i]);
    }
}

overload(1);
overload(1, 3);
overload(1, 5, "pesho");