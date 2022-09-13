/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LineEqualsUC3 extends LineComputationUC4 {
	
	public void lineOneLength() {
		int x1 = 6;
		int y1 = 9;
		int x2 = 10;
		int y2 = 12;
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of line one is: " + length1);

		int a1 = 6;
		int b1 = 9;
		int a2 = 10;
		int b2 = 12;
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("length of line two is: "+length2);
		
		
		
		String str1 = Double.toString(length1);
		String str2 = Double.toString(length2);
    	
    	boolean eq = str1.equals(str2);
    	if(eq==true) {
    		System.out.println("Line has equal length");
    	}
    	else {
    		System.out.println("Line not matched");
    	}
	}
		
	}


