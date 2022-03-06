from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World!")

    car = Car ("AMS234", Account("Andrea Herrera", "ANS455"))
    print(vars(car))
    print(vars(car.driver))
