class UberX extends Car{
    constructor(license, driver, brand, model){
        super(license, driver)
        this.brand = brand;
        this.model = model;
    }

    printDataCar(){
        console.group('UberX');
        super.printDataCar();
        console.log('Brand: ' + this.brand);
        console.log('Model: ' + this.model);
        console.groupEnd('UberX');
    }
}a