package com.backend.example;

import com.backend.example.exampleApiRest.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MySecondController {
    //get method
    @GetMapping("/get-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello(){
        return "hello from controler";
    }

    //post method
    @PostMapping("/post/order.2")
    public String post(@RequestBody Order order){//converts the body from the http request into the java object needed
        return "Reques accepted, order is: "+order.toString();
    }



}
