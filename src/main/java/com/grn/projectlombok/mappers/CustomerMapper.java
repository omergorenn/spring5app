package com.grn.projectlombok.mappers;

import com.grn.projectlombok.entities.Customer;
import com.grn.projectlombok.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO customerDTO);
    CustomerDTO customerToCustomerDto(Customer customer);
}
