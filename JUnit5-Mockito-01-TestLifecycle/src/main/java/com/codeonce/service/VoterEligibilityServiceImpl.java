package com.codeonce.service;

public class VoterEligibilityServiceImpl {
	
	private int age;
	
	public VoterEligibilityServiceImpl(int age) {
		this.age = age;
	}
	
	public boolean isPersoneEligibleForVote() {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
	}
}
