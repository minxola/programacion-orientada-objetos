class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Car car = new Car("AMQ23", new Account("Andres Herrera", "AND2345"));
        car.passenger = 4;
        car.printDataCar();

        Car car1 = new Car("SD454", new Account("Martin Lopez", "AND343"));
        car1.passenger = 2;
        car1.printDataCar();
    }
}