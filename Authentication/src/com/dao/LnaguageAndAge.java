package com.dao;

public class LnaguageAndAge {
		private String language;
		private String name;
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getName() {
			if(language.equals("java"))
				return "java is very powerful language";
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
