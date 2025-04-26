<?php
abstract class person{
    private string $names;
    private string $lastNames;
    private int $daysWorked;
    private int $dayValue;
    private int $transport;
    private float $salary;
    private string $position;
    function __construct(string $names, string $lastNames, int $daysWorked, int $dayValue, int $transport, float $salary,string $position){
        $this->names=$names;
        $this->lastNames=$lastNames;
        $this->daysWorked=$daysWorked;
        $this->dayValue=$dayValue;
        $this->transport=$transport;
        $this->salary=$salary;
        $this->position=$position;
    }
    public function getNames():string{
        return $this->names;
    }
    public function getLastNames():string{
        return $this->lastNames;
    }
    public function getDaysWorked():int{
        return $this->daysWorked;
    }
    public function getDayValue():int{
        return $this->dayValue;
    }
    public function getTransport():int{
        return $this->transport;
    }
    public function getSalary():float{
        return $this->salary;
    }
    public function getPosition():string{
        return $this->position;
    }
    abstract public function calculateSalary():float;
}
?>