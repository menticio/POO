<?php

    include('php/persona.php');
    include('php/vendedor.php');
    include('php/supervisor.php');
        
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php

    $vendedor= new vendedor;
    $vendedor->setName("unArvoL");

    $supervisor= new supervisor;
    $supervisor->setName("Felipe");


    
    echo "Nombre del vendedor:   ".$vendedor->getName()."<br>";
    echo "Nombre del supervisor: ".$supervisor->getName();
    ?>
</body>
</html>