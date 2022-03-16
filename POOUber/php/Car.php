<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    protected $passengers;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "License: $this->license,
        Driver: {$this->driver->name},
        Document: {$this->driver->document},
        Numero de pasajeros: $this->passengers"."<br>";
    }

    public function getPassenger(){
        return $this->passengers;
    }

    public function setPassenger($passengers){
        if($passengers == 4){
            $this->passengers = $passengers;
        } else {
            echo "Necesitas asignar 4 Pasajeros"."<br>";
        }
    }
}