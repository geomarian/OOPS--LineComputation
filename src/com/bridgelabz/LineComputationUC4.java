/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LineComputationUC4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Line length calculation");
		LengthCalculationUC1 LC = new LengthCalculationUC1();
		LC.firstLine();
		LC.secondLine();
		System.out.println("--------------------");
		
		System.out.println("Line- Equal length");
		LineEqualsUC3 LE = new LineEqualsUC3();
		LE.lineOneLength();
		
		
		System.out.println("--------------------");
		System.out.println("Line Comparison");
		LineComparisonUC2 LCMP = new LineComparisonUC2();
		LCMP.display(12, 14, 10, 20, 15, 24, 40, 70);
		
		
		
	}

}
