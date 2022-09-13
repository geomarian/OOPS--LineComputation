/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LengthCalculationUC1 extends LineComputationUC4{
	
	public void firstLine() {
		
		int x1 = 61;
		int y1 = 9;
		int x2 = 20;
		int y2 = 17;
		
		double lenght1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length of line one is: " + lenght1);
	}

	
	public void secondLine() {
		int a1 = 18;
		int b1 = 6;
		int a2 = 71;
		int b2 = 8;
		
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("length of line one is: " + length2);
	}
}
