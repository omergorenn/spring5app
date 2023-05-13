package com.grn.projectlombok.repositories;

import com.grn.projectlombok.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
