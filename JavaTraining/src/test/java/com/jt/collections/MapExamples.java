package com.jt.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Test;

public class MapExamples extends MyFormatter {

	@Test
	public void tc1() {
		
		Map<String, String> s = new HashMap<>();
		s.put(null,null);
		
		System.out.println(s);
		
	}
}
