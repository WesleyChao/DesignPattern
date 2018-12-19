package _03StrategyPattern;

import java.math.BigDecimal;
//MVP客户的报价策略实现
public class MVPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("哇偶！MVP客户享受7折优惠！！！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.7)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}