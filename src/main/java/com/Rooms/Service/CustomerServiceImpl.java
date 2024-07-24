package com.Rooms.Service;

import com.Rooms.Entity.Customer;
import com.Rooms.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        return saved;
    }
}
