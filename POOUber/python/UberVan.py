from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMeterial = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMeterial = seatsMaterial