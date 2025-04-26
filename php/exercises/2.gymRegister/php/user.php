<?php
include('plans.php');

class user extends persons{
  use plans;

    private string $plan;

    public function __construct(string $plan){

        $this->plan=$plan;

        parent :: __construct("Arbol","de dfsledas",64,60,1423424.60); 

    }
    
    public function getPlan(){

        return $this->plan;
    }
    public function ShowUser(){
        echo "<h1> The dates of user are</h1><hr>";
        echo  " The Name is: "  .$this->getName()." <br><hr>";
        echo  " The LastName is: ". $this->getLastname()." <br><hr>";
        echo  " The Identification is: " .$this->getIdentification()." <br><hr>";
        echo  " The Weigth is: " .$this->getWeigth()."kg <br><hr>";
        echo " The Stature is: " .$this->getStature()."cm <br><hr>";
    }
}
?>