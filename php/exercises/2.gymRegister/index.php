<?php
include('php/person.php');
include('php/user.php');

$person = new user("basic");

echo $person->ShowUser();
echo $person->showPlan();
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