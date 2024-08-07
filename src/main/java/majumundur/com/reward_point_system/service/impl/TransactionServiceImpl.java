package majumundur.com.reward_point_system.service.impl;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.dto.request.TransactionRequest;
import majumundur.com.reward_point_system.entity.Customer;
import majumundur.com.reward_point_system.entity.Product;
import majumundur.com.reward_point_system.entity.Transaction;
import majumundur.com.reward_point_system.repository.CustomerRepository;
import majumundur.com.reward_point_system.repository.ProductRepository;
import majumundur.com.reward_point_system.repository.TransactionRepository;
import majumundur.com.reward_point_system.service.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;


    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction saveTransaction(TransactionRequest transactionRequest) {

        Customer customer = customerRepository.findById(transactionRequest.getCustomerId()).orElseThrow();
        Product product = productRepository.findById(transactionRequest.getProductId()).orElseThrow();

        Transaction transaction = Transaction.builder()
                .customer(customer)
                .product(product)
                .transactionTime(LocalDateTime.now())
                .build();

        Customer cs = Customer.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .password(customer.getPassword())
                .phoneNumber(customer.getPhoneNumber())
                .points(customer.getPoints() + 10)
                .build();
        customerRepository.saveAndFlush(cs);

        return transactionRepository.save(transaction);

    }
}
