package com.egiantsprojects.practice.example.currencyconversion;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@Component
public interface CurrencyExchangeServiceProxy {
  @GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean retrieveExchangeValue (@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity);

}