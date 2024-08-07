package majumundur.com.reward_point_system.service;

import majumundur.com.reward_point_system.entity.Merchant;

import java.util.List;

public interface MerchantService {
    List<Merchant> getAllMerchants();
    Merchant saveMerchant(Merchant merchant);
    void deleteMerchant(String id);

}
