package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hellow")
    public String getHello() {
        return "Hello World !!!!!";
    }

    @GetMapping(path = "/hellowb")
    public HelloBean getHelloBean() {
        return new HelloBean("Hello World");
    }

    @GetMapping(path = "/hellowb/path-variable/{name}")
    public HelloBean getHelloBeanPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("Hello %s", name));
    }


}
