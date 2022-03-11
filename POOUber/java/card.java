class Card extends Payment{
    String cardNumber;
    String cvv;
    String date;
    public Card(int id, String cardNumber, String cvv, String date){
        super(id);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date = date;
    }
}