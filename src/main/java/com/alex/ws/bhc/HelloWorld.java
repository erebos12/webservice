package com.alex.ws.bhc;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name="text") String text);
    
    int sum(@WebParam(name="num1") int num1, @WebParam(name="num2") int num2);
}