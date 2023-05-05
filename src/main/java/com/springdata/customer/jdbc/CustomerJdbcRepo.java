package com.springdata.customer.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerJdbcRepo {
    // define the query to be executed
    private static String insertQuery = """
            INSERT INTO CUSTOMER (id, username, email) 
            VALUES (?, ?, ?);
            """;

    private static String DeleteQuery = """
            DELETE FROM CUSTOMER 
            WHERE id = ?
            """;

    private static String GetByIdQuery = """
            SELECT FROM Customer 
            WHERE id = ?
            """;

    // define a jdbc template property and inject it to be used to execute the query
    @Autowired
    private JdbcTemplate _jdbc;

    public CustomerJdbcRepo(JdbcTemplate jdbc) {
        _jdbc = jdbc;
    }

    // execute the query
    public void InsertNewCustomer(Customer newCustomer) {
        _jdbc.update(insertQuery, newCustomer.getId(), newCustomer.getUsername(), newCustomer.getEmail());
    }

    public void DeleteCustomer(Long customerId) {
        _jdbc.update(DeleteQuery, customerId);
    }

    public Customer GetById(Long customerId) {
        return _jdbc.queryForObject(
                GetByIdQuery,
                new BeanPropertyRowMapper<>(Customer.class),
                customerId
        );
    }
}
