package com.openclassrooms.testing.premiertest;

public class Calculator {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public void longCalculation() {
		try {
			Thread.sleep(500);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
