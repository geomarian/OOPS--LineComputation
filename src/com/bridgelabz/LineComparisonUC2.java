/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LineComparisonUC2 extends LineComputationUC4  {

	public void display(int x1,int y1,int x2,int y2,int a1,int b1,int a2,int b2) {
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of the line one is: " + length1);
		String str1 = Double.toString(length1);
		
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("length of line two is: "+length2);
    	String str2 = Double.toString(length2);
    	        
    	int compare= str1.compareTo(str2);       
		
		if(compare > 0)
			System.out.println("Line two is greater than line one");
		else if(compare < 0)
			System.out.println("Line two is smaller than line one");
		else
			System.out.println("Both lines are equal");
	}
	
}
