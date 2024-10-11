function overload(...params){
    console.log(params);
    for (let i = 0; i < params.length; i++){
        console.log(params[i]);
    }
}

overload(1);
overload(1, 3);
overload(1, 5, "pesho");