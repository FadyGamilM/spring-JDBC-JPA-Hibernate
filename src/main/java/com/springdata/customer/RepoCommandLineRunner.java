package com.springdata.customer;

import com.springdata.customer.jdbc.CustomerJdbcRepo;
import com.springdata.customer.jpa.Customer;
import com.springdata.customer.jpa.CustomerJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepoCommandLineRunner implements CommandLineRunner {
/*    // inject the repository [JDBC]
    @Autowired
    private CustomerJdbcRepo _courseJdbcRepo;

    @Override
    public void run(String... args) throws Exception {
        _courseJdbcRepo.InsertNewCustomer(new Customer(1L, "fadyGamil", "fady@gmail.com"));
        _courseJdbcRepo.InsertNewCustomer(new Customer(2L, "magyMagdy", "magy@gmail.com"));
        _courseJdbcRepo.InsertNewCustomer(new Customer(3L, "MarwanMohamed", "marwan@gmail.com"));
        _courseJdbcRepo.DeleteCustomer(2L);

        System.out.println(_courseJdbcRepo.GetById(3L));
    }*/

    // inject the repo [JPA]
    @Autowired
    private CustomerJpaRepo _jpaRepo;
    @Override
    public void run(String... args) throws Exception {
        _jpaRepo.Insert(new Customer(1L, "fadyGamil", "fady@gmail.com"));
    }

}
