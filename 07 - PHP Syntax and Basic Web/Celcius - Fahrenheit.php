<?php
function celsiusToFahrenheit(float $celsius) : float
{
    return $celsius * 1.8 + 32;
}

function fahrenheitToCelsius(float $fahrenheit) : float
{
    return ($fahrenheit - 32) / 1.8;
}

$msgAfterCelsius = "";
if (isset($_GET['cel']))
{
    $cel = floatval($_GET['cel']);
    $fah = celsiusToFahrenheit($cel);
    $msgAfterCelsius = "$cel &deg;C = $fah &deg;F";
}

$msgAfterFahrenheit = "";
if (isset($_GET['fah']))
{
    $fah = floatval($_GET['fah']);
    $cel = fahrenheitToCelsius($fah);
    $msgAfterFahrenheit = "$fah &deg;F = $cel &deg;C";
}
?>

<form>
    Celsius:
    <span style="margin: 19.5px">
        <input type="text" name="cel" />
    <input type="submit" value="Convert">
        </span>
    <?php echo $msgAfterCelsius ?>
</form>

<form>
    Fahrenheit:
    <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?php echo $msgAfterFahrenheit ?>
</form>
