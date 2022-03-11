class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
/*         passenger = 3;
        System.out.println("Passenger: " + passenger); */
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println(

                "El nombre del conductor es " + driver.name + " y su licencia es " + license
            );
        }
    }

    //Uso de getter and setter
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
        this.passenger = passenger;
        } else{
            System.out.println("El valor debe ser 4");
        }
    }
}

