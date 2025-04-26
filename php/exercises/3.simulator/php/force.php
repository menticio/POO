<?php
abstract class force {
 
    private float $mass;
    private float $acceleration;

    function __construct(float $mass, float $acceleration) {
        $this->mass = $mass;
        $this->acceleration = $acceleration;
    }
   
    function getMass(): float {
        return $this->mass;
    }

    function getAcceleration(): float {
        return $this->acceleration;
    }
}
?>