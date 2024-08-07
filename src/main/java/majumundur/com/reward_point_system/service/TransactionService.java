package majumundur.com.reward_point_system.service;

import majumundur.com.reward_point_system.dto.request.TransactionRequest;
import majumundur.com.reward_point_system.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {
    List<Transaction> getAllTransactions();
    Transaction saveTransaction(TransactionRequest transactionRequest);


}
