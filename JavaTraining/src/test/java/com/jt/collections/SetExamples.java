package com.jt.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

public class SetExamples extends MyFormatter {

	@Ignore
	@Test
	public void regularSetExample() {
		Set<String> s = new HashSet<>();
		s.add("Aishwarya");
		s.add("Asin");
		s.add("Simran");
		s.add("Tabu");
		s.add("Katrina");
		s.add("Tabu");
		
		System.out.println("The size of this list is: " + s.size() );
		s.forEach(e -> System.out.println(e));
	}
	
	@Ignore
	@Test
	public void LinkedHashSetExmple() {
		Set<String> s = new LinkedHashSet<>();
		s.add("Aishwarya");
		s.add("Asin");
		s.add("Simran");
		s.add("Tabu");
		s.add("Katrina");
		s.add("Tabu");
		
		System.out.println("The size of this list is: " + s.size() );
		s.forEach(e -> System.out.println(e));
	}
	
	@Ignore
	@Test
	public void TreeHashSetExmple() {
		Set<String> s = new TreeSet<>();
		s.add("Aishwarya");
		s.add("Asin");
		s.add("Zeenat");
		s.add("Simran");
		s.add("Tabu");
		s.add("Katrina");
		s.add("Tabu");
		
		System.out.println("The size of this list is: " + s.size() );
		s.forEach(e -> System.out.println(e));
	}
}
