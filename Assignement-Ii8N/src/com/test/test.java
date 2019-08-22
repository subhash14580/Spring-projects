package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringXml.xml");
		
		Locale english = Locale.ENGLISH;
       
        String firstName = "subhash";
        String lastName = "N";
        String lang = "hi";
		String country = "IN";
		Locale l = new Locale(lang,country);
        System.out.println("English:");
        System.out.println(ac.getMessage("english", args, english));
        System.out.println("Hindi:");
        System.out.println(ac.getMessage("hindi", args, l));
        
        List<String> li = new ArrayList<String>();
        li.add("subhash");
        li.add("vivek");
        li.forEach(temp -> System.out.println(temp));
        
			}
}
