<?php
trait discounts{
    private string $errorMensage="";
    private float $arl=0;
    private float $pension=0;
    private float $health=0;
    private float $totalDiscounts=0;
    
    public function getArl(int $risk):float{
        if($risk==1){return 0.00522;
        }
        else if($risk==2){return 0.01044;
        }
        else if($risk==3){return 0.02436;
        }
        else if($risk==4){return 0.04350;
        }    
        else{$this->errorMensage=" This level no exists";
            return 0;
        }
    }
    public function initDiscounts(int $salary,int $risk){
        $this->arl=$salary*$this->getArl($risk);
        $this->pension=$salary*0.04;
        $this->health=$salary*0.04;
        $this->totalDiscounts=$this->health+$this->pension+$this->arl;
    }
    public function showDiscounts():void{
        echo "<p>Pension: ". $this->pension."</p>";
        echo "<p>Health: ".$this->health."</p>";
        echo "<p>Arl: ".$this->arl."</p>";
        echo "<p>Total discount: ".$this->totalDiscounts."</p>";
    }
}
?>