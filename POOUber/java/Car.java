class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println(

            "El nombre del conductor es " + driver.name + " y su licencia es " + license
        );
    }
}

