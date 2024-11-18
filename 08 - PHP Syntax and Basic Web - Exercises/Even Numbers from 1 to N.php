<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Even Numbers from 1 to N</title>
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

    for ($i = 1; $i <= $currentNumber; $i++) {
        if ($i % 2 == 0)
        {
            $result .= $i . " ";
        }
    }
    echo trim($result);
}
?>
</body>
</html>
