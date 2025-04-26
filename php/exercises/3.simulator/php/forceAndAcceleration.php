<?php
trait lawTwo {

    public function optionReviewLawTwo() {
        if ($this->name == "Law Two"){
            $this->calculateForceLawTwo();  
        } else { 
            echo "Unknown law";
        }
    }
    public function calculateForceLawTwo(){
        echo "According to Newton's second law, the reaction force is ". $this->getMass() ." * " .$this->getAcceleration();
        $force = $this->getMass() * $this->getAcceleration();
        echo "giving a result of: " . $force . " N. ";
    }
}
?>