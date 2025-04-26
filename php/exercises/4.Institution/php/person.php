<?php
abstract class persons{  

    private string $name;
    private string $lastName;
    private int $identification;
    private int $telephone;
    private string $rh;
    private string $address;

    function __construct(string $name, string $lastName, int $identification, int $telephone, string $rh,string $address){
        $this->name=$name;
        $this->lastName=$lastName;
        $this->identification=$identification;
        $this->telephone=$telephone;
        $this->rh=$rh;
        $this->address=$address;
    }
    public function getName():string{
        return $this->name;
    }
    public function getLastName():string{
        return $this->lastName;
    }
    public function getIdentification():int{
        return $this->identification;
    }
    public function getTelephone():string{
        return $this->telephone;
    }
    public function getRh():string{
        return $this->rh;
    }
    public function getaddress():string{
        return $this->address;
    }

    
}
?>