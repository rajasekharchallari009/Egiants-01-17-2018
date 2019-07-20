package com.egiantsprojects.practice.example.currencyconversion;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyExchangeServiceProxyImpl implements CurrencyExchangeServiceProxy {
    CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean();
    @Override
    public CurrencyConversionBean retrieveExchangeValue(String from, String to, BigDecimal qunatity) {

        currencyConversionBean.setFrom(from);
        currencyConversionBean.setTo(to);
        currencyConversionBean.setQuantity(qunatity);
        if (from.equalsIgnoreCase("USD") && to.equalsIgnoreCase("INR")){
             BigDecimal totalCalculatedAmount = qunatity.multiply(new BigDecimal(67));

            currencyConversionBean.setConversionMultiple(new BigDecimal(67));
            currencyConversionBean.setTotalCalculatedAmount(totalCalculatedAmount);
            return currencyConversionBean;
        }
        if (from.equalsIgnoreCase("INR") && to.equalsIgnoreCase("USD")){
             BigDecimal totalCalculatedAmount = qunatity.multiply(new BigDecimal(0.015));

            currencyConversionBean.setConversionMultiple(new BigDecimal(0.015));
            currencyConversionBean.setTotalCalculatedAmount(totalCalculatedAmount);
            return currencyConversionBean;
        }
        if (from.equalsIgnoreCase("EUR") && to.equalsIgnoreCase("USD")){
             BigDecimal totalCalculatedAmount = qunatity.multiply(new BigDecimal(1.12));

            currencyConversionBean.setConversionMultiple(new BigDecimal(0.015));
            currencyConversionBean.setTotalCalculatedAmount(totalCalculatedAmount);
            return currencyConversionBean;
        }
        if (from.equalsIgnoreCase("EUR") && to.equalsIgnoreCase("INR")){
             BigDecimal totalCalculatedAmount = qunatity.multiply(new BigDecimal(77.28));

            currencyConversionBean.setConversionMultiple(new BigDecimal(77.28));
            currencyConversionBean.setTotalCalculatedAmount(totalCalculatedAmount);
            return currencyConversionBean;
        }
        currencyConversionBean.setMessage("Please Check Currency exchange among USD - INR or INR - USD  or EUR - ISD or EUR - INR only !!! ");
        return currencyConversionBean;
    }
}
