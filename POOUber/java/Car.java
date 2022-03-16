class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }


}

