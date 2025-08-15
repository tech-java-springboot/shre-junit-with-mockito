package com.codeonce.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
public class VoterEligibilityServiceImplTest {
	
	public VoterEligibilityServiceImplTest() {
		System.out.println("VoterEligibilityServiceImplTest class instance is created");
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
	void testIsPersoneEligibleForVote() {
		System.out.println("inside testIsPersoneEligibleForVote() method");
		//Arrange
		VoterEligibilityServiceImpl voter = new VoterEligibilityServiceImpl(18);
		
		//Act
		boolean result = voter.isPersoneEligibleForVote();
		
		//Assert
		assertTrue(result);
	}
	
	@Test
	void testIsPersoneEligibleForVoteFailuer() {
		System.out.println("inside testIsPersoneEligibleForVoteFailuer() method");
		//Arrange
		VoterEligibilityServiceImpl voter = new VoterEligibilityServiceImpl(15);
		
		//Act
		boolean result = voter.isPersoneEligibleForVote();
		
		//Assert
		assertFalse(result);
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
