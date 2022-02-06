package com.mohamed.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = new Customer();
        customer.setFirstname( request.getFirstName());
        customer.setEmail(request.getEmail());
        customer.setLastName(request.getEmail());

        customerRepository.save(customer);

    }
}
