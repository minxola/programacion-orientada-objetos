from hashlib import new
from car import Car

if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.license = "ASD234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "AKD234"
    car2.driver = "Juan Martinez"
    print(vars(car2))
