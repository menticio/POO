<?php
include_once('deductions.php');
    class administrator extends person{
    use deductions;
        
        public function __construct(){
            $daysWorked=12;
            $dayValue=87000;
            $salary=$daysWorked*$dayValue;
            $transport= ($salary<2000000)?200000:0;
        
        parent:: __construct("Carla Sofia","Zuleta Dussan",$daysWorked,$dayValue,$transport,$salary,"Administrator"); 
        $this-> initDeductions($salary);
        }
            public function calculateSalary():float{
                 return ($this->getDaysWorked()*$this->getDayValue())-$this->totalDeductions;
            }
            public function show():void{
                echo "<h1>Information of the worker: ".$this->getPosition()."</h1>";
                echo "<h2>Position: ".$this->getPosition(). "</h2>";
                echo "<p>Names and last names: " . $this->getNames() ." ". $this->getLastNames() ."</p>";
                echo "<p>Days worked: "  .$this->getDaysWorked(). "</p>";
                echo "<p>Day value: " .$this->getDayValue()."$"."</p>";
                echo "<p>With a salary of: ". $this->getSalary()."$"."</p>";
                echo "<p>With a auxiliary of transport of: ". $this->getTransport()."$". "</p>";
                $this->showDeductions();
                echo "<p>For obtain a fullpayment of: ". $this->calculateSalary()."$"."</p>";
            }
        }
?>