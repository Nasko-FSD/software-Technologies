<?php
$result = "";

if ($_SERVER["REQUEST_METHOD"] == "GET" &&
    isset($_GET['num1']) &&
    isset($_GET['num2']))
{
    // Get input values and validate
    $firstNumber = filter_var($_GET['num1'], FILTER_VALIDATE_INT);
    $secondNumber = filter_var($_GET['num2'], FILTER_VALIDATE_INT);

    // Ensure both numbers are valid integers
    if ($firstNumber !== false &&
        $secondNumber !== false)
    {
        $result = $firstNumber * $secondNumber; // No need to intval again
    }
    else
    {
        $result = "Please enter valid integers.";
    }
}
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Multiply Two Numbers</title>
</head>
<body>
<form method="get">
    <label for="num1">First Number: </label>
    <input type="text" name="num1" id="num1" value="<?php
    if (isset($_GET['num1'])) {
        echo htmlspecialchars($_GET['num1']);
    }
    else
    {
        echo '';
    }
    ?>"/>

    <label for="num2">Second Number: </label>
    <input type="text" name="num2" id="num2" value="<?php
    if (isset($_GET['num2'])) {
        echo htmlspecialchars($_GET['num2']);
    }
    else
    {
        echo '';
    }
    ?>"/>

    <input type="submit" value="Multiply" /><br>

    <?php
    // Display result if it exists
    if ($result !== "")
    {
        echo htmlspecialchars($result);
    }
    ?>
</form>
</body>