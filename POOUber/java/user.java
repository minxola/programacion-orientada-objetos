class User extends Account{
    public User(int id, String name, String document, String email, String password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }
}