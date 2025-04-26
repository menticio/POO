<?php
    
    include('php/figureGeometric.php');  
    include('php/circle.php');         
    include('php/square.php');
    include('php/triangle.php');
    include('php/rectangle.php');

    $circle = new Circle(32);
    $triangle = new triangle(12,15);
    $rectangle = new rectangle(14,180);
    $square = new square(295);
    
    echo "<h2>Information of the Figures</h2>";
    echo "<h3>".$circle->getName()."</h3>";
    echo "<p>Name of figure: " . $circle->getName() . "</p>";
    echo "<p>Name in spanish: " . $circle->getSpanishName() . "</p>";
    echo "Area of the Circle: " . $circle->calculateArea() . "<br>";
    echo "<h3>".$triangle->getName()."</h3>";
    echo "<p>Name of figure: " . $triangle->getName() . "</p>";
    echo "<p>Name in spanish: " . $triangle->getSpanishName() . "</p>";
    echo "Area of the Triangle: " . $triangle->calculateArea() . "<br>";
    echo "<h3>".$square->getName()."</h3>";
    echo "<p>Name of figure: " . $square->getName() . "</p>";
    echo "<p>Name in spanish: " . $square->getSpanishName() . "</p>";
    echo "Area of the Square: " . $square->calculateArea() . "<br>";
    echo "<h3>".$rectangle->getName()."</h3>";
    echo "<p>Name of figure: " . $rectangle->getName() . "</p>";
    echo "<p>Name in spanish: " . $rectangle->getSpanishName() . "</p>";
    echo "Area of the Rectangle: " . $rectangle->calculateArea() . "<br>";

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
</html>