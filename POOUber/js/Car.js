/* function Car(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function(){
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
} */

class Car{
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this._passenger;
    }

    get passenger(){
        return this._passenger;
    }

    set passenger(passengers){
        if (passengers == 4){
            this._passenger = passengers;
        } else{
            console.log("Debes tener 4 pasajeros");
        }
    }

    printDataCar(){
        console.log(this.driver);
        console.log('Driver Name: ' + this.driver.name);
        console.log('Driver Document: ' + this.driver.document);
        console.log('Passengers: ' + this.passenger);
    }
}