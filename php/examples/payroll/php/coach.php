<?php
include_once('deductions.php');
    class coach extends person{
    use deductions;
        private int $customersAttented;
        private int $bonus;
        private int $totalBonus;

        public function __construct(int $customersAttented, int $bonus, int $totalBonus=0){
            $this->customersAttented=$customersAttented;
            $this->bonus=$bonus;
            $this->totalBonus=intdiv($this->customersAttented,5)*$this->bonus;

            $daysWorked=27;
            $dayValue=45000;
            $salary=$daysWorked*$dayValue;
            $transport= ($salary<2000000)?200000:0;
        
        parent:: __construct("Juanito of Jesus","Perez Iguaran",$daysWorked,$dayValue, $transport,$salary,"Coach"); 
        $this-> initDeductions($salary);
        }
            public function calculateSalary():float{
                 return ($this->getDaysWorked()*$this->getDayValue())-$this->totalDeductions;
            }
            public function getTotalBonus():int{
                return $this->totalBonus;
            }
            public function getCustomersAttented():int{
                return $this->customersAttented;
            }
            public function show():void{
                echo "<h1>Information of the worker: ".$this->getPosition()."</h1>";
                echo "<h2>Position: ".$this->getPosition(). "</h2>";
                echo "<p>Names and last names: " . $this->getNames() ." ". $this->getLastNames() ."</p>";
                echo "<p>Days worked: "  .$this->getDaysWorked(). "</p>";
                echo "<p>Day value: " .$this->getDayValue()."$"."</p>";
                echo "<p>With a salary of: ". $this->getSalary()."$"."</p>";
                echo "<p>With a auxiliary of transport of: ". $this->getTransport()."$". "</p>";
                echo "<p> Con la cantidad de " . $this->getCustomersAttented()." "."personas atendidas"."</p>";
                echo "<p> Gaining a bonus of: " . $this->getTotalBonus(). "$". "</p>";
                $this->showDeductions();
                echo "<p>For obtain a fullpayment of: ". $this->calculateSalary()."$"."</p>";
            }
        }
?>