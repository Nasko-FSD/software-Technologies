<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tribonacci Sequence</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>

<?php

if (isset($_GET['num'])) {
    $currentNumber = intval($_GET['num']);

    $tribonacciOne = 1;
    $tribonacciTwo = 1;
    $tribonacciThree = 2;

    $allNumbers = array($tribonacciOne, $tribonacciTwo, $tribonacciThree);

    for ($i = 3; $i < $currentNumber; $i++) {
        $nTribonacci = $tribonacciOne + $tribonacciTwo + $tribonacciThree;
        $allNumbers[] = $nTribonacci;
        $tribonacciOne = $tribonacciTwo;
        $tribonacciTwo = $tribonacciThree;
        $tribonacciThree = $nTribonacci;
    }
    echo implode(" ", $allNumbers);
}
?>
</body>
</html>