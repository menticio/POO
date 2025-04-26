<?php

trait licences {


private string $mensageError="";

public function licence(){


    if ( $this->getLicence()=="License A") {

        echo "<h1>THE LICENSE SELECT IS: A</h1>";

        return "This license have a cost  of $".  34000 . " and lasts for Six months";

    }else 
    if(  $this->getLicence()=="License B"){
        echo "<h1>THE LICENSE SELECT IS: B</h1>";
       

        return "This license have a cost  of $". 47500 . " and lasts for Eight mounths";

    }else
    if($this->getLicence()=="License C"){
        echo "<h1>THE LICENSE SELECT IS: C</h1>";
    

        return  "This license have a cost  of $".   75800 ." and last for Twelve mounths";
       

    }else{  echo "<h1>THE LICENSE SELECT IS: ???</h1>";
            echo $this->mensageError="error this isn't a license";
    }
    
        

}

  

    public function showLicence(){
        echo $this->mensageError;
        return $this->licence();
       
    }

    



}





?>