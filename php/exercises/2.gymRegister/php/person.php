<?php
abstract class persons{  

    private string $name;
    private string $lastName;
    private int $identification;
    private float $weigth;
    private float $stature;

    function __construct(string $name, string $lastName, int $identification, float $weigth, float $stature){
        $this->name=$name;
        $this->lastName=$lastName;
        $this->identification=$identification;
        $this->weigth=$weigth;
        $this->stature=$stature;
    }
    public function getName():string{
        return $this->name;
    }
    public function getLastName():string{
        return $this->lastName;
    }
    public function getIdentification():int{
        return $this->identification;
    }
    public function getWeigth():string{
        return $this->weigth;
    }
    public function getStature():string{
        return $this->stature;
    }

    
}
?>