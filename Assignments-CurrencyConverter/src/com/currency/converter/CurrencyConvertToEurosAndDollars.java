package com.currency.converter;

public class CurrencyConvertToEurosAndDollars implements ExchangeService{

	String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public double getExchangeRate(double amount) {
		// TODO Auto-generated method stub
		if(getCountry().equals("Euros")) {
			return amount / 100;
		}else if(getCountry().equals("Dollars")) {
			return amount/70;
		}
		return 0;
	}
	

}
