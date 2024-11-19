<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Prime Numbers from N to 1</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);
    $allNumbers = [];

    for ($i = $num; $i >= 2; $i--) {
        if (isPrime($i)) {
            array_push($allNumbers, $i);
        }
    }
}

function isPrime($num) {
    if ($num < 2) {
        return false;
    }

    for ($i = 2; $i <= $num / 2; $i++) {
        if ($num % $i == 0) {
            return false;
        }
    }
    return true;
}
echo implode(" ", $allNumbers);
?>
</body>
</html>