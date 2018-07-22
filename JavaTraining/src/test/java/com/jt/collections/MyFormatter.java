package com.jt.collections;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;

public class MyFormatter {

	@Before
	public  void startTest() {
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Starting Test ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                                                    ");
	}
	
	@After
	public  void stopTest() {
		System.out.println("---------------------------------------------------");
		System.out.println("Stopping Test ");
		System.out.println("---------------------------------------------------");
		System.out.println("                                                    ");
	
	}
}
