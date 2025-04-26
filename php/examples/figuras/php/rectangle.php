<?php
class rectangle extends  FigureGeometric{

    private float $sideOne;
    private float $sideTwo;

    public function __construct(float $sideOne, float $sideTwo){
        parent:: __construct("Rectangle","Rectangúlo");
            $this->sideOne = $sideOne;
            $this->sideTwo= $sideTwo;
        }
            public function calculateArea(): float{
                return $this->sideOne*$this->sideTwo;
            }       
        }
?> 