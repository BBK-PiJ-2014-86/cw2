package cw2;

import java.util.Scanner;

public class FractionCalculatorTest {
	
	
	public static void main (String[] args){ 
	
		FractionCalculator calculator = new FractionCalculator();
		Fraction testFraction = new Fraction(1,4);
	    //calculator.evaluate(testFraction, "+");
	    //System.out.println(calculator.currentValue+ " " +calculator.operator);
	    // the following line tries to add another consecutive operator and should print an error
	    //calculator.evaluate(testFraction, "+");
	    
	    calculator.evaluate(testFraction, "1/4 + 2/4");
	    System.out.println(calculator.currentValue+ " " +calculator.operator);
	}
}
