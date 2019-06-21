package com.reactive.customer.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.reactive.customer.model.Customer;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, String> {

}
