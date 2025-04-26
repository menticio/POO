<?php

class supervisor extends persona{
    private string $supervisorType;

    public function __construct(){
    }
    public function getSupervisorType():string{
        return $this->supervisorType;
    }
    public function setSupervisorType(string $supervisorType): void{
        $this->supervisorType = $supervisorType;
    }
}
?>