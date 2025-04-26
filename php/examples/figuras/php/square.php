<?php
class square extends FigureGeometric{

    private float $side;

    public function __construct(float $side){
        parent:: __construct("Square","Cuadrado");
            $this->side = $side;
    }
            public function calculateArea(): float{
                return $this->side*$this->side;
            }       

    }
?> 