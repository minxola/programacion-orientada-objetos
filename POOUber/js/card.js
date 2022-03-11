class Card extends Payment{
    constructor(id, cardNumber, cvv, date){
        super(id);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date = date;
    }
}