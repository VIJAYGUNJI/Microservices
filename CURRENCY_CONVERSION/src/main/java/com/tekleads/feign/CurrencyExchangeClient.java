package com.tekleads.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tekleads.beans.CurrencyExchangeBean;

@FeignClient(name = "CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeClient {

	@GetMapping(value = "/getCurrencyExchangeCost/from/{from}/to/{to}/")
	public CurrencyExchangeBean invokeCeApi(@PathVariable("from") String from, @PathVariable("to") String to);

}
