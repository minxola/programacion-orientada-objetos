<?php
require_once('car.php');
class UberPool extends Car{
    public $bland;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}