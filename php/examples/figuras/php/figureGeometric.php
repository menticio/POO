<?php


abstract class FigureGeometric{
    private string $name;
    private string $spanishName;
    function __construct(string $name, string $spanishName){
        $this->name = $name;
        $this->spanishName = $spanishName;
    }
    public function getName():string{
        return $this->name;
    }
    public function getSpanishName():string{
        return $this->spanishName;
    }
    abstract public function calculateArea():float; 
}
?>