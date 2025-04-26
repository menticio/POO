<?php

trait plans {

private string $mensageError="";

public function plan(){
    
    if($this->getPlan()=="basic") {
        echo "<h1>THE PLAN SELECT IS: BASIC</h1>";
        return "This plan have a cost  of $".  34000 . " access general of rhe GYM";
    }else 
    if($this->getPlan()=="medium"){
        echo "<h1>THE PLAN SELECT IS: MEDIUM</h1>";
        return "This plan have a cost  of $". 56000 . " includes directed classes in the GYM ";
    }else
    if($this->getPlan()=="premium"){
        echo "<h1>THE PLAN SELECT IS: PREMIUM</h1>";
        return  "This plan have a cost  of $".   88000 ." Includes personal trainer and wet area in the GYM";
    }else{  echo "<h1>THE PLAN SELECT IS: ???</h1>";
            echo $this->mensageError="error this isn't a plan";
    }
}

    public function showPlan(){
        echo $this->mensageError;
        return $this->plan();  
    }
}
?>