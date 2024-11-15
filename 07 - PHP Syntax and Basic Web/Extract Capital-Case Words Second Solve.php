<?php

if (isset($_GET['text'])) {
    $text = $_GET['text'];

    preg_match_all('/\b[A-Z]+\b/', $text, $upperWords);

    $upperWords = $upperWords[0];
    echo implode(', ', $upperWords);
}
?>

<form>
    <textarea rows="10" name="text"></textarea>
    <br>
    <input type="submit" value="Sort"/>
</form>