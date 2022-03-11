from car import Car
from account import Account
from UberX import UberX
from payment import Payment
from card import Card
from user import User
from driver import Driver

if __name__ == "__main__":
    print("Hello World!")

    car = Car ("AMS234", Account("Andrea Herrera", "ANS455"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AMD333", Account("Peter Turner", "ANS888"), "Nissan", "Sentra")
    print(vars(uberX))
    print(vars(uberX.driver))

    card = Card('Card', '12334122', '445', '12/25')
    print(vars(card))

    user = User('User', 'Juan Rojas', 'DOC1111', 'user@mail.com', '23142')
    print(vars(user))

    driver = Driver('Driver', 'Tim Soares', 'DOC3333', 'driver@mail.com', '23123')
    print(vars(driver))