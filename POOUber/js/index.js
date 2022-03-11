var car = new Car("AW456", new Account("Andres Herrera", "AND453"));
car.passenger = 3;
car.printDataCar();

var uberX = new UberX("AW456", new Account("Andrea Ferran", "AND99"), "Chevrolet", "Spark");
uberX.passenger = 4;
uberX.printDataCar();

var payment = new Payment('Payment');
payment.printDataPayment();

var card = new Card('Card', '32324123411', '323', '12/24');
card.printDataPayment();

var cash = new Cash('Cash', 45);
cash.printDataPayment();

var paypal = new PayPal('PayPayl', 'email@email');
paypal.printDataPayment();

var user = new User('User', 'Jorge Perez', 'ANS88', 'email@email', 'asdfjksd');
user.printDataAccount();