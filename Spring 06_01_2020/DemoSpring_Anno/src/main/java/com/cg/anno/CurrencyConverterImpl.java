package com.cg.anno;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component //("currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	//@Autowired
	private ExchangeServiceImpl exchangeService;
	// currencyConverterImpl 
	
	
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}
	
	@Autowired
	public CurrencyConverterImpl(ExchangeServiceImpl exchangeService) {
		System.out.println("CurrencyConverterImpl(es)");
		this.exchangeService = exchangeService;
	}
	
	

	/*public ExchangeServiceImpl getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeServiceImpl exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}*/

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};