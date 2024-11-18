<?php
$result = "";
if (isset($_GET['num1']) &&
    isset($_GET['num2']))
{
    $firstNumber = intval($_GET['num1']);
    $secondNumber = intval($_GET['num2']);

    if ($firstNumber > $secondNumber)
    {
        $result = $firstNumber / $secondNumber;
    }
    else
    {
        $result = $firstNumber * $secondNumber;
    }
}

?>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Multiply or Divide Numebrs</title>
</head>
<body>
<form>
    <input type="text" name="num1"/>
    <input type="text" name="num2"/>
    <input type="submit"/><br>
    <?php
        echo $result;
    ?>
</form>
</body>
</html>