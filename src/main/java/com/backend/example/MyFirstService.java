package com.backend.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class MyFirstService {

    /*FIELD DEPENDENCY, not recomended*/
    //@Autowired
    @Qualifier("bean2")
    private MyFirstClass myFirstClass;
    /*CONSTRUCTOR DEPENDIENCY*/
    public MyFirstService(MyFirstClass myFirstClass){
        this.myFirstClass=myFirstClass;
    }


    public String tellAStory(){
        return "the Bean is saying : "+myFirstClass.sayHello();
    }
}
