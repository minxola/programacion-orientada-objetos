<?php
require_once('Car.php');
require_once('Account.php')

$car = new Car ("ASD455", new Account("Andres Herrera", "ANS678"));
$car->printDataCar();