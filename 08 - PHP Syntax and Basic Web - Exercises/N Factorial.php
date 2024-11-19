<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>N Factorial</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>
<?php
$result = 1;

if (isset($_GET['num'])) {
    $currentNum = intval($_GET['num']);

    for ($i = 1; $i <= $currentNum; $i++) {
        $result *= $i;
    }
    echo $result;
}
?>
</body>
</html>