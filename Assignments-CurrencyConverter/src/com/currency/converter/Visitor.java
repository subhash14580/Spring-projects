package com.currency.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
		@Autowired
		@Qualifier("currencyTOInr")
		CurrencyConverterToINR currencyToINR;
		public CurrencyConverterToINR getCurrencyToINR() {
			return currencyToINR;
		}
		public void setCurrencyToINR(CurrencyConverterToINR currencyToINR) {
			this.currencyToINR = currencyToINR;
		}
		public CurrencyConvertToEurosAndDollars getCurrenyToEurosAndDollars() {
			return currenyToEurosAndDollars;
		}
		public void setCurrenyToEurosAndDollars(CurrencyConvertToEurosAndDollars currenyToEurosAndDollars) {
			this.currenyToEurosAndDollars = currenyToEurosAndDollars;
		}
		@Autowired
		@Qualifier("currencyInrToEuros")
		CurrencyConvertToEurosAndDollars currenyToEurosAndDollars;
		@Value("${com.visitor.name}")
		String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
