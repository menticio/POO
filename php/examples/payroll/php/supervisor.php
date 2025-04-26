<?php
include_once('coach.php');
include_once('deductions.php');
    class supervisor extends person{
    use deductions;

        private int $bonus;
        private int $totalBonus=0;
        private coach $coach;

        public function __construct(coach $coach, int $bonus, int $totalBonus=0){
            $this->coach=$coach;
            $trainedCustomers=$this->coach->getCustomersAttented();
            $this->bonus=$bonus;
            $this->totalBonus=intdiv($trainedCustomers,5)*$this->bonus;
            $daysWorked=27;
            $dayValue=85000;
            $salary=$daysWorked*$dayValue;
            $transport= ($salary<2000000)?200000:0;
        
        parent:: __construct("Julian Esteban","Diaz",$daysWorked,$dayValue, $transport,$salary,"Supervisor"); 
        $this-> initDeductions($salary);
        }
            public function calculateSalary():float{
                 return ($this->getDaysWorked()*$this->getDayValue())-$this->totalDeductions;
            }
            public function getTotalBonus():int{
                return $this->totalBonus;
            }
            public function show():void{
                echo "<h1>Information of the worker: ".$this->getPosition()."</h1>";
                echo "<h2>Position: ".$this->getPosition(). "</h2>";
                echo "<p>Names and last names: " . $this->getNames() ." ". $this->getLastNames() ."</p>";
                echo "<p>Days worked: "  .$this->getDaysWorked(). "</p>";
                echo "<p>Day value: " .$this->getDayValue()."$"."</p>";
                echo "<p>With a salary of: ". $this->getSalary()."$"."</p>";
                echo "<p>With a auxiliary of transport of: ". $this->getTransport()."$". "</p>";
                echo "<p>Gaining a bonus of: " . $this->getTotalBonus(). "$". "</p>";
                $this->showDeductions();
                echo "<p>For obtaing a fullpayment of: ". $this->calculateSalary()."$"."</p>";
            }            
    }
?>