<?php
$tokens = explode(',', 'PHP,,,, SQL, HTML, Java');
$tokens = array_filter(array_map('trim', $tokens));
echo strtolower(implode(' - ', $tokens));