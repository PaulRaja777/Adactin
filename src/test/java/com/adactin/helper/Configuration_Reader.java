package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String url = p.getProperty("db_Username");
		return url;
	}
	
	public String getPassword() {
		String password = p.getProperty("db_Password");
		return password;
	}
	
	public String getCVV() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
