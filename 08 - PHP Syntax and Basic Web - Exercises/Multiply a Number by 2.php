<?php
if (isset($_GET['num']))
{
    $currentNumber = intval($_GET['num']);
    $result = $currentNumber * 2;
}
?>

<form>
    Enter a Number: <input type="text" name="num" />
    <input type="submit" /><br>
    <?php
        echo $result;
    ?>
</form>