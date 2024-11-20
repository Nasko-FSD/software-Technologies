<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RGB Table</title>
    <style>
        table * {
            border: 1px solid black;
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>

    <?php
    $color = 51;
    for ($i = 0; $i < 5; $i++) {
        echo "<tr>";
        echo "<td style='background-color: rgb($color,0,0)'></td>";
        echo "<td style='background-color: rgb(0,$color,0)'></td>";
        echo "<td style='background-color: rgb(0,0,$color)'></td>";
        echo "</tr>";
        $color += 51;
    }
    ?>

</table>
</body>
</html>