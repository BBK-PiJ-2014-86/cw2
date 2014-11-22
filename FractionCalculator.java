package cw2;

import java.util.Scanner;

public class FractionCalculator {   

	private Fraction currentValue=null;	
	private String operator = null;
	
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
					if (operator.isEmpty()){
					operator ="+";
					} else {
					error();
					}
				} else if (parts[i].equals("-")){
				    if (operator.isEmpty()) {
				    	operator = "-";
				    } else {
				    	error();
				    }
				} else if (parts[i].equals("/")){
				    if (operator.isEmpty()) {
				    	operator = "/";
				    } else {
				    	error();
				    }
				}  else if (parts[i].equals("*")){
				    if (operator.isEmpty()) {
				    	operator = "*";
				    } else {
				    	error();
				    }
				
			    }  else {
			    	
			    }
			}
			
			
		    currentValue = newFractionValue;
			return newFractionValue;
		}
	
	private void error() {
		System.out.println("Error");
	}

	}

