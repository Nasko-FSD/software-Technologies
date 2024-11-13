<ul>
    <?php for ($i = 1; $i <=20; $i++): ?>
        <?php if ($i % 2 == 1): ?>
            <li><span style="color:blue"><?php echo $i; ?></span></li>
        <?php else: ?>
            <li><span style="color:green"><?php echo $i; ?></span></li>
        <?php endif; ?>
    <?php endfor; ?>
</ul>