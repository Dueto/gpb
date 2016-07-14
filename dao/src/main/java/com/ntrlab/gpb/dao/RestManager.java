package com.ntrlab.gpb.dao;

import com.ntrlab.gpb.common.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by PRIMA on 14.07.2016.
 */
@Stateless
public class RestManager {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public List<Customer> getCustomerList() {
        return em.createQuery("select c from Customer c", Customer.class).getResultList();
    }
}
