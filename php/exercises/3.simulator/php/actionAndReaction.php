<?php
trait lawThree {
    public function optionReviewLawThree() {
        if ($this->name == "Law Three") {
            $this->calculateForceLawThree();  
        } else { 
            echo "Unknown law";
        }
    }
    public function calculateForceLawThree(): float {
        $force = $this->getMass() * $this->getAcceleration();
        echo "The action force is: " . $force . " N. ";
        echo "According to Newton's third law, the reaction force is " . -$force . " N.<br>";
        return -$force;
    }
}
?>
