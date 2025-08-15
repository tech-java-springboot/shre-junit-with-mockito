package com.codeonce;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * OUTPUT
 * @TestInstance(Lifecycle.PER_METHOD)
----------------------------------------
inside @BeforeAll method
ApplicationTests class Instance created
inside @BeforeEach method
inside Testcase 1
inside @AfterEach method
ApplicationTests class Instance created
inside @BeforeEach method
inside Testcase 2
inside @AfterEach method
inside @AfterAll method
*/

@TestInstance(Lifecycle.PER_METHOD)
class ApplicationTests {
	
	public ApplicationTests() {
		System.out.println("ApplicationTests class Instance created");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("inside @BeforeAll method");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("inside @BeforeEach method");
	}

	@Test
	void testCase1() {
		System.out.println("inside Testcase 1");
	}
	
	@Test
	void testCase2() {
		System.out.println("inside Testcase 2");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("inside @AfterEach method");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("inside @AfterAll method");
	}
}
