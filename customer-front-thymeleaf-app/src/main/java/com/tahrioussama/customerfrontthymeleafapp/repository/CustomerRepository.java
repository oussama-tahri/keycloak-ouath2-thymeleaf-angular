package com.tahrioussama.customerfrontthymeleafapp.repository;


import com.tahrioussama.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
