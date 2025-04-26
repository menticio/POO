<?php
    include('php/person.php');  
    include('php/coach.php');
    include('php/supervisor.php');
    include('php/administrator.php');

    $coach = new coach(7,1000);
    $coach->show();
    $supervisor = new supervisor($coach,60000);
    $supervisor->show();
    $admin= new administrator();
    $admin->show();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payroll</title>
</head>
<body>
    
</body>
</html>