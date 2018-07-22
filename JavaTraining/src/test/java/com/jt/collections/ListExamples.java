package com.jt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class ListExamples extends MyFormatter{

	
	@Ignore
	@Test
	public void addelements() {
		
		List<String> a1 = new ArrayList<String>();
		a1.add("Tom");
		a1.add("Ram");
		a1.add("Bam");
		a1.add("Sham");
		
		//Print list items in different ways
		
		//System.out.println(a1);
		//System.out.println(a1.get(1));
		
		for(String s: a1) {
			System.out.println(s);
		}
	}
	
	@Ignore
	@Test
	public void removingElements() {
		List<String> a1 = new ArrayList<String>();
		a1.add("Tom");
		a1.add("Ram");
		a1.add("Bam");
		a1.add("Sham");
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.removeIf(e -> e.equals("Sham"));
		System.out.println(a1);
		
		List<String> a2 = new ArrayList<String>();
		a2.add("Tom");
		a2.add("Ram");
		a2.add("Bam");
		a2.add("Sham");
		
		a2.retainAll(a1);
		System.out.println(a2);
	}
	
	@Ignore
	@Test
	public void addAllTest() {
		
		List<Integer> a2 = new ArrayList<>();
		a2.add(2);
		a2.add(4);
		a2.add(6);
		
		List<Integer> a1 = new ArrayList<>();
		a1.addAll(a2);
		
		System.out.println(a1);
		System.out.println(a2);	
	}
	
	@Test
	public void linkedArrayList() {
		
		List<String> a1 = new ArrayList<>();
		a1.add("Tom");
		a1.add("Ram");
		a1.add("Bam");
		a1.add("Sham");
		
		Collections.sort(a1);
		
		//Print list items in different ways
		
		//System.out.println(a1);
		//System.out.println(a1.get(1));
		
		for(String s: a1) {
			System.out.println(s);
		}
	}
}
