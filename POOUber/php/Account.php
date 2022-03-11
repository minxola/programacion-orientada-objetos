<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }

    public function printDataAccount(){
        echo "ID: $this->id, Name: {$this->name}, document: {$this->document}, Email: {$this->email}"."<br>";
    }
}