<?php
class triangle extends  FigureGeometric{

    private float $base;
    private float $height;

    public function __construct(float $base, float $height){
        parent:: __construct("Triangle","Triangulo");
            $this->base = $base;
            $this->height= $height;
        }
            public function calculateArea(): float{
                return ($this->base*$this->height)/2;
            }       
        }
?> 