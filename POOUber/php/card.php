<?php
require_once('payment.php');

class Card extends Payment{
    public $cardNumber;
    public $cvv;
    public $date;

    public function __construct($id, $cardNumber, $cvv, $date){
        parent::__construct($id);
        $this->cardNumber = $cardNumber;
        $this->cvv = $cvv;
        $this->date = $date;
    }
}