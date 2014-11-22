package cw2;

import java.util.Scanner;

public class FractionCalculator {   

		
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
				if(input.equals("Q") | input.equals("q")) {
					break;
				}
				
			}
	}

		public Fraction evaluate (String inputString) {
			return null;
		}

	}

