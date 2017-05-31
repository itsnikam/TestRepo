package com.qtest.basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="nitin";
		System.out.println(st);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sony\\Desktop\\Samarthview\\geckodriver.exe");
		WebDriver dr =new FirefoxDriver();
		dr.get("http://www.gmail.com");	
		dr.findElement(By.linkText("Find my account")).click();
		System.out.println(dr.getCurrentUrl());
		
	}

}
