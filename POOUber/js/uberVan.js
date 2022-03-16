class UberVan extends Car{
    constructor(license, driver, typeCarAcceppted, seatsMaterial) {
        super(license, driver);
        this.typeCarAcceppted = typeCarAcceppted;
        this.seatsMaterial = seatsMaterial;
    }

    get passenger(){
        return this._passenger;
    }

    set passenger(passengers){
        if(passengers == 6){
            this._passenger = passengers;
        } else {
            console.log("Debes tener 6 pasajeros");
        }
    }

}