<?php

class vendedor extends persona{
    private string $typeSeller;
    private string $typeProduct;
    
    public function __construct(){
    }
    public function getTypeSeller():string{
        return $this->typeSeller;
    }
    public function setTypeSeller(string $typeSeller): void{
        $this->typeSeller = $typeSeller;
    }
    public function getTypeProduct(): string{
        return $this->typeProduct;
    }
    public function setTypeProduct(string $typeProduct): void{
        $this->typeProduct = $typeProduct;
    }
}
?>