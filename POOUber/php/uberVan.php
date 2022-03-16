<?php
require_once('car.php');
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatMaterial;
    protected $passengers;

    public function __construct($license, $driver, $typeCarAccepted, $seatMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatMaterial = $seatMaterial;
    }

    public function setPassenger($passengers){
        if($passengers == 6){
            $this->passengers = $passengers;
        } else{
            echo "Necesitas asignar 6 pasajeros";
        }
    }
}