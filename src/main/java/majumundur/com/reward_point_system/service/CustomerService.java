package majumundur.com.reward_point_system.service;

import majumundur.com.reward_point_system.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
    void deleteCustomer(String id);



}
