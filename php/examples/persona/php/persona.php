<?php

class Persona{  
    private int $identification;
    private string $name;  
    private string $lastName;
    private int $telephone;

    public function getIdentification(): int{
    return $this->identification;
    }
    public function setIdentification(int $identification): void{
       $this->identification = $identification;
    }  
    public function getName(): string{
        return $this->name;
    }
    public function setName(string $name): void{
        $this->name = $name;
    }
    public function getLastName():string{
        return $this->lastName;
    }
    public function setLastName(string $lastName): void{
        $this->lastName = $lastName;
    }
    public function getTelephone():int{
        return $this->telephone;
    }
    public function setTelephone(int $telephone): void{
        $this->telephone = $telephone;
    }
}
?>