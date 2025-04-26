<?php
include('discounts.php');
    class worker extends person{
    use discounts;
        private string $position;
        private int $risk;
        private float $extraPayment=0;
        private int $bonus=1;
        public function __construct(string $position, int $risk){
            $this->position=$position;
            $this->risk=$risk;
            
            parent:: __construct("Julanito", 38000, 35 ,"Nighttime");
                $this->initDiscounts($this->getSalary(),$this->getRisk());
                
                if($this->getScheduleType()=="Daytime"){
                    $this->extraPayment=1.25;
                } else if($this->getScheduleType()=="Nighttime"){
                    $this->extraPayment=1.75;
                } else if($this->getScheduleType()=="Holyday"){
                    $this->extraPayment=2;
                } else {
                    $this->errorMensage="the schedule don't exists";
                }
        }
        public function getBonus():int{
              if($this->getSalary()<(2*$this->bonus)){
                return $this->bonus;
            }else{
                return $this->bonus=0;
            }
        }
        public function calculateHourSalary():float{
            return $this->getSalary()/(30*8);
        }
        public function getPosition():string{
            return $this->position;
        }
        public function getRisk():int{
            return $this->risk;
        }
        public function calculateSalary():float{
            return $this->getSalary()+$this->calculateExtra()+$this->getBonus()-$this->totalDiscounts;
        }
        public function calculateExtra():float{
            return ($this->extraPayment*$this->getOvertime())*$this->calculateHourSalary();
        }
        public function show():void{
            echo "<h2>Dates of worker</h2>";
            echo "<p>Name :". $this->getName()."</p>";
            echo "<p>Mensual salary : ". $this->getSalary()."</p>";
            echo "<p>Hour salary : ". $this->calculateHourSalary()."</p>";
            echo "<p>Overtime : ".$this->getOvertime()."</p>";
            echo "<p>Work Schedule: ".$this->getScheduleType()."</p>";
            echo "<p>The payment of Extra hours is: ". $this->calculateExtra(). "$</p>";    
            echo "<p>Position : ".$this->getPosition()."</p>";
            echo "<p>Risk : ".$this->getRisk().$this->errorMensage."</p>";
            echo "<h2>The discounts are: </h2>";
            echo $this->showDiscounts();
            echo "The total payment is: ". $this->calculateSalary()."<br>";
        }
}