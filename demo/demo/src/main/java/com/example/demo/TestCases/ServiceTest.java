package com.example.demo.TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.Service;

public class ServiceTest {

	
	@Test
	public void testAdd() {
		Service service = new Service();
		int i=service.add(5, 7);
		assertEquals(13,i);
	}
}
