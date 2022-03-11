/* function Account(name, document){
    this.id;
    this.name = name;
    this.document = document;
    this.email;
    this.password;
} */

class Account{
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    printDataAccount(){
        console.log({
            name: this.name,
            document: this.document,
            email: this.email
        })
    }
}