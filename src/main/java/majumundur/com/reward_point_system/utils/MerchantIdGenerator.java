package majumundur.com.reward_point_system.utils;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MerchantIdGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        String prefix = "M";
        String query = "SELECT COALESCE(MAX(CAST(SUBSTRING(id, 2) AS INTEGER)), 0) FROM m_merchants";
        Integer max = (Integer) sharedSessionContractImplementor.createNativeQuery(query).getSingleResult();
        int nextId = (max == null ? 1 : max + 1);
        return prefix + String.format("%03d", nextId);
    }
}
