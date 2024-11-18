<?php
$result = "";
if (isset($_GET['num']))
{
    $currentNumber = intval($_GET['num']);
    for ($i = 1; $i <= $currentNumber; $i++)
    {
        $result .= $i . " ";
    }
}
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Numbers from 1 to N</title>
</head>
<body>
<form>
    <input type="text" name="num"/>
    <input type="submit"/><br>
    <?php
        echo trim($result);
    ?>
</form>
</body>
</html>