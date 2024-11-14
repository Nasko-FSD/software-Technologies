<?php
$ages = ["Nakov" => 25, "Maria" => 22, "George" => 12];
echo $ages['Nakov'] . "<br>\n";

$ages['Kiro'] = 15; //Add new key-value pair
$ages['Nakov'] = 26; //Change existing value for given key
unset($ages['George']); //Delete existing key
$ages['Maria'] = 'no age'; //Mixing type is allowed

foreach ($ages as $name => $age)
{
    echo "Name: $name, age: $age<br>\n";
}
?>