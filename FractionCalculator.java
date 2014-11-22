package cw2;

import java.util.Scanner;

public class FractionCalculator {   

	public Fraction currentValue=null;	
	public String operator = null;
	
	public static void main (String [] args) {
		
		FractionCalculator calculator = new FractionCalculator();
		calculator.launch();
		
	}
	
	private void launch() {

			Scanner sc = new Scanner (System.in);
			System.out.println("Welcome to Andrean Georgiev's fraction calculator");
			System.out.println("Enter the expressions. Enter q or Q to exit at any time.");
			
						
			while (true) {
				String input = sc.nextLine();
				evaluate(currentValue,input);
				}
				
			}

	public Fraction evaluate (Fraction fraction ,String inputString) {			
			Fraction newFractionValue = new Fraction(fraction.getNumerator(),fraction.getDenominator());
			
			String parts [] = inputString.split(" ");
			
			for (int i = 0; i<parts.length; i++) {
				
				if(parts[i].equals("+")) {
					if (operator==null){
					operator ="+";
					} else {
					error();
					}
				} else if (parts[i].equals("-")){
				    if (operator==null) {
				    	operator = "-";
				    } else {
				    	error();
				    }
				} else if (parts[i].equals("/")){
				    if (operator==null) {
				    	operator = "/";
				    } else {
				    	error();
				    }
				}  else if (parts[i].equals("*")){
				    if (operator==null) {
				    	operator = "*";
				    } else {
				    	error();
				    }
				
			    }  else if (parts[i].contains("/")) { //means that it's a fraction
			       	Fraction tempFraction = new Fraction (Character.getNumericValue(parts[i].charAt(0)), Character.getNumericValue(parts[i].charAt(2)));
			       	
			       		if (operator == null) {
			       			newFractionValue.setNumerator(tempFraction.getNumerator());
			       			newFractionValue.setDenominator(tempFraction.getDenominator());
			       		} else if (operator == "+") {
			       			newFractionValue.add(tempFraction);
			       		} else if (operator == "-") {
			       			newFractionValue.subtract(tempFraction);
			       		} else if (operator == "*") {
			       			newFractionValue.multiply(tempFraction);
			       		} else if (operator == "/") {
			       			newFractionValue.divide(tempFraction);
			       		} else {
			       			error();
			       		}
			    }
			}
			
			
		    currentValue = newFractionValue;
			return newFractionValue;
		}
	
	private void error() {
		System.out.println("Error");
	}

	}

