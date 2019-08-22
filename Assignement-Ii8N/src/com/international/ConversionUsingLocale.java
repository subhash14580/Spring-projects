package com.international;

import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConversionUsingLocale {
	public static void main(String[] args) {
		/*
		 * String lang = "en"; String country = "US"; Locale l = new
		 * Locale(lang,country); ResourceBundle r =
		 * ResourceBundle.getBundle("config",l);
		 */
		//System.out.println(r.getString("string.hindi"));
		Logger logger = LogManager.getLogger();
		logger.debug("Hello world baby java");
		System.out.println("This is printed");
	}
}
