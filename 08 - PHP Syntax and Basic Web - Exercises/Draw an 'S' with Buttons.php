<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Draw an "S" with Buttons</title>
</head>
<body>
<?php

for ($i = 0; $i < 9; $i++) {

    for ($j = 0; $j < 5; $j++) {
        if ($i % 4 == 0) {
            echo "<button style='background-color: blue'>1</button>";
        } else if ($j == 0 && $i < 4 ||
                   $j == 4 && $i >= 4) {
            echo "<button style='background-color: blue'>1</button>";
        } else {
            echo "<button>0</button>";
        }
    }
    echo "<br>";
}
?>
</body>
</html>