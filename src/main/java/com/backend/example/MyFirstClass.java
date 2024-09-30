package com.backend.example;

//@Component considera a la clase como un beam mismo resultado con service o crepository
public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "HELLO FRIEND ---- myVar: "+myVar;
    }
}
