<?php
class circle extends FigureGeometric{

    private float $radio;
    private float $pi=3.1416;

    public function __construct(float $radio){
        parent:: __construct("Circle","Circulo");
            $this->radio = $radio;
    }
            public function calculateArea(): float{
                return $this->radio*$this->radio*$this->pi;
            }       
        }
?> 