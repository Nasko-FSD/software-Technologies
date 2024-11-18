<?php
$result = "";
    if (isset($_GET['num1']) &&
        isset($_GET['num2']) &&
        isset($_GET['num3']))
    {
        $numbers = [
            intval($_GET['num1']),
            intval($_GET['num2']),
            intval($_GET['num3'])
        ];

        $count = 0;

        foreach ($numbers as $number)
        {
            if ($number <= 0)
            {
                $count++;
            }
        }

        if ($count % 2 == 1)
        {
            $result = "Negative";
        }
        else
        {
            $result = "Positive";
        }
    }
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product of 3 Numbers</title>
</head>
<body>
<form>
    <input type="text" name="num1"/>
    <input type="text" name="num2"/>
    <input type="text" name="num3"/>
    <input type="submit"/><br>
    <?php
        echo $result;
    ?>
</form>
</body>
</html>