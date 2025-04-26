<?php
include('licences.php');
class user extends persons{
  use licences;
    private string $licence;
    public function __construct(string $licence){
        $this->licence=$licence;
        parent :: __construct("Juancito","Diaz",3,312123132,"A","wood"); 
    }   
    public function getLicence(){
        return $this->licence;
    }
    public function ShowUser(){
        echo "<h1> The dates of the user are</h1><hr>";
        echo  " The Name is: "  .$this->getName()." <br><hr>";
        echo  " The LastName is: ". $this->getLastname()." <br><hr>";
        echo  " The Identification is: " .$this->getIdentification()." <br><hr>";
        echo  " The rh is:" .$this->getRh()." <br><hr>";
        echo  " The Identification is: " .$this->getAddress()." <br><hr>";
    }
}
?>