/*
 * This program finds out the unit digit in a^b where a,b are integers
 */

import java.util.*;
public class unitDigit1
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter base and power respectively : ");
		String base = scn.next();
		String exp = scn.next();
		int col = Integer.parseInt(Character.toString(base.charAt(base.length()-1)));
		long pow = Long.parseLong(exp);
		
		long ans[][] = {{0,0,0,0,0,0,0,0,0,0},
					    {0,1,2,3,4,5,6,7,8,9},
					    {0,1,4,9,6,5,6,9,4,1},
					    {0,1,8,7,4,5,6,3,2,9},
					    {0,1,6,1,6,5,6,1,6,1}};
		
		int row = (pow%4 == 0)?4:(int)(pow%4);
		
		System.out.println(base+"^"+pow+" = MAP["+row+"]["+col+"] = "+ans[row][col]);
		scn.close();
	}
}