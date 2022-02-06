package com.mohamed.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customeregRequest){

        customerService.registerCustomer(customeregRequest);
        System.out.println(customeregRequest);

    }
}
