<?php
trait lawOne {
    public function optionReviewLawOne() {
        if ($this->name == "Law One") {
            $this->calculateForceLawOne(); 
        } else {
            echo "Unknown law";
        }
    }
    public function validate() {
        $force = $this->getMass() * $this->getAcceleration();
        return $force;
    }
    public function result($force) {
        if ($force == 0) {
            echo "The object maintains its state (at rest or in uniform motion).";
        } else {
            echo "The object has a force of " . $force . " N acting on it, but it still maintains its motion (unless external force changes this).";
        }
    }
    public function calculateForceLawOne(): void {
        $force = $this->validate();
        $this->result($force);
    }
}
?>