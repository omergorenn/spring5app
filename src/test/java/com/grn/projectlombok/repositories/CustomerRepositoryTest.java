package com.grn.projectlombok.repositories;

import com.grn.projectlombok.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer(){
        Customer customerSaved = customerRepository.save(Customer.builder().customerName("omer").build());
        assertThat(customerSaved).isNotNull();
        assertThat(customerSaved.getId()).isNotNull();
    }
}