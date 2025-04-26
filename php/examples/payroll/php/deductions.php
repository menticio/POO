<?php
trait deductions{
    public float $health;
    public float $arl;
    public float $pension;
    public float $totalDeductions;
    public function initDeductions(float $salary){
        $this->health=round(($salary*0.12)/50)*50;
        $this->arl=round(($salary*0.052)/50)*50;
        $this->pension=round(($salary*0.16)/50)*50;
        $this->totalDeductions=$this->health+$this->arl+$this->pension;
    }
    public function showDeductions():void{
        echo "<h3>The disocunts are: </h3>";
        echo "<p>In health: " .$this->health."$"."</p>";
        echo "<p>In the ARL: " .$this->arl."$". "</p>";
        echo "<p>In pension: " .$this->pension."$"."</p>";
        echo "<p>giving a total discount of: ". $this->totalDeductions."$"."</p>";
    }
}
?>