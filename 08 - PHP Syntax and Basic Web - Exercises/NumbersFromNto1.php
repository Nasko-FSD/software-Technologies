<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Numbers from N to 1</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
</form>

<?php
$result = "";
if (isset($_GET['num']))
{
    $currentNumber = intval($_GET['num']);

    for ($i = $currentNumber; $i >= 1; $i--) {
        $result .= $i . " ";
    }
    echo trim($result);
}
?>
</body>
</html>