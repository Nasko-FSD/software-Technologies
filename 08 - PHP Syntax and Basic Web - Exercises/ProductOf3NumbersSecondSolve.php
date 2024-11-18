<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product of 3 Numbers Second Solve</title>

</head>
<body>
    <form>
        X: <input type="text" name="num1" />
		Y: <input type="text" name="num2" />
        Z: <input type="text" name="num3" />
		<input type="submit" />
    </form>

    <?php
        if (isset($_GET['num1']) &&
            isset($_GET['num2']) &&
            isset($_GET['num3']))
            {
                $firstNumber = intval($_GET['num1']);
                $secondNumber = intval($_GET['num2']);
                $thirdNumber = intval($_GET['num3']);

                $numbers = array($firstNumber, $secondNumber, $thirdNumber);

                $negativeCount = count(array_filter($numbers, function ($x) {
                   return $x <= 0;
                }));

                if ($negativeCount % 2 == 1)
                {
                    echo "Negative";
                }
                else
                {
                    echo "Positive";
                }
            }
    ?>

</body>
</html>