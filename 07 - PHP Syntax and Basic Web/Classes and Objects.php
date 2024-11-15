<?php
class Cat
{
    protected $name;
    protected $age;

    public function __construct($name, $age)
    {
        $this->name = $name;
        $this->age = $age;
    }

    public function __toString()
    {
        return "Mew from $this->name!";
    }

    public function getName()
    {
        return $this->name;
    }

    public function growOlder()
    {
        $this->age++;
    }

    public function getAge()
    {
        return $this->age;
    }

    public function setName($name)
    {
        return $this->name = $name;
    }

    public function setAge($age)
    {
        return $this->age = $age;
    }
}

$someCat = new Cat('Ivan', 7);
echo "{$someCat}<br>";

$someCat->growOlder(); // If i want to output the growOlder i have to call it otherwise it's gonna print 7
echo "{$someCat->getAge()}<br>";

echo "{$someCat->getName()}<br>";

$someCat->setName('Whiskers');
echo "{$someCat->getName()}<br>"; //here is getName not setName!!!

$someCat->setAge('18');
echo "{$someCat->getAge()}<br>"; //Here is getAge not setAge!!!
?>