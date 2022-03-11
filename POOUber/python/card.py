from payment import Payment

class Card(Payment):
    cardNumber = str
    cvv = str
    date = str

    def __init__(self, id, number, CVV, date):
        super().__init__(id)
        self.cardNumber = number
        self.cvv = CVV
        self.date = date