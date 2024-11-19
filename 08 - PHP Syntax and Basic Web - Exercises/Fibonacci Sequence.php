<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fibonacci Sequence</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>

<?php

if (isset($_GET['num'])) {
    $currentNumber = intval($_GET['num']);

    $fibonacciOne = 1;
    $fibonacciTwo = 1;

    $fibNumbers = array($fibonacciOne, $fibonacciTwo);

    for ($i = 2; $i < $currentNumber; $i++) {
        $nFibonacci = $fibonacciOne + $fibonacciTwo;
        $fibNumbers[] = $nFibonacci; //Add the new Fibonacci number to the array
        $fibonacciOne = $fibonacciTwo;
        $fibonacciTwo = $nFibonacci;
    }
    echo implode(" ", $fibNumbers);
}
?>
</body>
</html>