package com.springdata.customer.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Transactional
@PersistenceContext
@Component
public class CustomerJpaRepo {
    // TODO : inject the entityManager
    @Autowired
    private EntityManager _entityManager;

    // TODO : Insert new row
    public void Insert(Customer customer){
        _entityManager.merge(customer);
    }
}
