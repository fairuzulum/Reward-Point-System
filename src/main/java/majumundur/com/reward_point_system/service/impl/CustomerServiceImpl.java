package majumundur.com.reward_point_system.service.impl;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.entity.Customer;
import majumundur.com.reward_point_system.repository.CustomerRepository;
import majumundur.com.reward_point_system.service.CustomerService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
