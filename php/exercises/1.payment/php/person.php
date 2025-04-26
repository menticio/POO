<?php

abstract class person{  
    private string $name;
    private int $salary;
    private int $overtime;
    private string $scheduleType;

    function __construct(string $name, int $salary, int $overtime, string $scheduleType){
        $this->name=$name;
        $this->salary=$salary;
        $this->overtime=$overtime;
        $this->scheduleType=$scheduleType;
    }
    public function getName():string{
        return $this->name;
    }
    public function getSalary():int{
        return $this->salary;
    }
    public function getOvertime():int{
        return $this->overtime;
    }
    public function getScheduleType():string{
        return $this->scheduleType;
    }
    public abstract function calculateSalary():float;
}
?>