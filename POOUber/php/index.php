<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');
require_once('payment.php');
require_once('cash.php');
require_once('card.php');
require_once('paypal.php');
require_once('user.php');
require_once('driver.php');


$uberX = new UberX("CVB233", new Account("Andres Herrera", "AND44"), "Chevrolet", "Sparl");
$uberX->printDataCar();

$uberPool = new UberPool("AMD33", new Account("Andrea Farran", "ASD99"), "Nissan", "Spark");
$uberPool->printDataCar();

$payment = new Payment ('Payment');
$payment->printDataPayment();

$cash = new Cash ('Cash');
$cash->printDataPayment();

$card = new Card ('Card', '231234xxx', '342', '12/26');
$card->printDataPayment();

$paypal = new PayPal('PayPal', 'email@email');
$paypal->printDataPayment();

$driver = new Driver("Driver", "Jorge Perez", "23234523", "email@email", "askwiesoa23");
$driver->printDataAccount();

$driver = new User("User", "Joan Ramirez", "23346555", "email@email", "asdf4342462");
$driver->printDataAccount();

?>