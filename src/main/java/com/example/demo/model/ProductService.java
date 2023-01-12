package com.example.demo.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

    @PersistenceContext
    private EntityManager em;

    public void save(Product product) {
        em.persist(product);
    }
}