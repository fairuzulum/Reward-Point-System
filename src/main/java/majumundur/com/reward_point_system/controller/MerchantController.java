package majumundur.com.reward_point_system.controller;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.entity.Merchant;
import majumundur.com.reward_point_system.service.MerchantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/merchant")
public class MerchantController {
    private final MerchantService merchantService;

    @GetMapping
    public List<Merchant> getAllMerchants() {
        return merchantService.getAllMerchants();
    }

    @PostMapping
    public Merchant createMerchant(@RequestBody Merchant merchant) {
        return merchantService.saveMerchant(merchant);
    }

    @DeleteMapping("/{id}")
    public void deleteMerchant(@PathVariable String id) {
        merchantService.deleteMerchant(id);
    }




}
