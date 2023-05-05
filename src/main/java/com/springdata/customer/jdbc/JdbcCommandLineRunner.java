package com.springdata.customer.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {
    // inject the repository
    @Autowired
    private CustomerJdbcRepo _courseJdbcRepo;

    @Override
    public void run(String... args) throws Exception {
        _courseJdbcRepo.InsertNewCustomer(new Customer(1L, "fadyGamil", "fady@gmail.com"));
        _courseJdbcRepo.InsertNewCustomer(new Customer(2L, "magyMagdy", "magy@gmail.com"));
        _courseJdbcRepo.InsertNewCustomer(new Customer(3L, "MarwanMohamed", "marwan@gmail.com"));
        _courseJdbcRepo.DeleteCustomer(2L);

        System.out.println(_courseJdbcRepo.GetById(3L));
    }
}
