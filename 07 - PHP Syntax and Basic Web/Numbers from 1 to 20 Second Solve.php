<ul>
    <?php
    for ($i = 1; $i <=20; $i++)
    {
        if ($i % 2 == 1)
        {
            $color = 'blue';
        }
        else
        {
            $color = 'green';
        }
        echo "<li><span style='color: $color'>$i</span></li>\n";
    }
    ?>
</ul>