class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car("AMQ23", new Account("Andres Herrera", "AND2345"));
        //car.passenger = 4;
        car.setPassenger(4);
        car.printDataCar();

        Car uberX = new UberX("ASD44", new Account("Juan Rojas", "DOC55"), "Nissan", "Sentra");
        //uberX.passenger = 2;
        uberX.setPassenger(4);
        uberX.printDataCar();

        Payment paypal = new PayPal(95844, "paypal@mail.com");
        paypal.printDataPayment();

        Account driver = new Driver(555, "Maria Arrieros", "DOC444", "driver@mail.com", "4dk·323");
        driver.printDataAccout();
    }
}