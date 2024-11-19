<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Not Divisor Numbers</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>

<?php
$result = "";
if (isset($_GET['num'])) {
    $currentNumber = intval($_GET['num']);

    for ($i = $currentNumber - 1; $i >= 2; $i--) {

        if ($currentNumber % $i != 0) {
            $result .= $i . " ";
        }
    }
    echo trim($result);
}
?>
</body>
</html>