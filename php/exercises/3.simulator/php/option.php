<?php
include('force.php');
include("actionAndReaction.php");
include("inertia.php");
include("forceAndAcceleration.php");

class option extends force {

    use lawOne;
    use lawTwo;
    use lawThree;

    private string $name;

    public function __construct(string $name) {
        parent::__construct(123.65, 317.5);
        $this->name = $name;
    }

    public function review() {

        if ($this->name=="Law One"){
            echo "Results with Law One: <br>";
            $this->optionReviewLawOne();
        }else if($this->name=="Law Two"){
            echo "<br>Results with Law Two: <br>";
            $this->optionReviewLawTwo();
        }else if($this->name=="law Three"){
            echo "<br>Results with Law Three: <br>";
            $this->optionReviewLawThree();
        } else {echo "this law don't exists";}
     }
}
?>