package cw2;

import java.util.Scanner;

public class FractionCalculator {   

	private Fraction currentValue=null;	
	private String operator = "";
	
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
			Fraction value = new Fraction(0,1);
			String parts [] = inputString.split(" ");
			
			
			for (int i = 0; i<parts.length; i++) {
				
				
				
				
			}
			
		    currentValue = value;
			return value;
		}

	}

