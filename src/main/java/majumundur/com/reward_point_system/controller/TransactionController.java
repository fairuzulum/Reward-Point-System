package majumundur.com.reward_point_system.controller;


import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.dto.request.TransactionRequest;
import majumundur.com.reward_point_system.entity.Transaction;
import majumundur.com.reward_point_system.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody TransactionRequest transaction) {
        return transactionService.saveTransaction(transaction);
    }

}
