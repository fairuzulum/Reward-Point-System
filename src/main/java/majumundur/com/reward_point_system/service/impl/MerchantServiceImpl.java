package majumundur.com.reward_point_system.service.impl;

import lombok.RequiredArgsConstructor;
import majumundur.com.reward_point_system.entity.Merchant;
import majumundur.com.reward_point_system.repository.MerchantRepository;
import majumundur.com.reward_point_system.service.MerchantService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;

    @Override
    public List<Merchant> getAllMerchants() {
        return merchantRepository.findAll();
    }

    @Override
    public Merchant saveMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    @Override
    public void deleteMerchant(String id) {
        merchantRepository.deleteById(id);
    }


}
