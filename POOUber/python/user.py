from account import Account

class User(Account):
    def __init__(self, id, name, document, email, password):
        super().__init__(name, document)
        self.id = id
        self.email = email
        self.password = password