package If_Else;

import java.util.Scanner;

public class IsCenturyYearPlusLeapYearOrNot {
	public static void main(String[] args) {
		//WAP to check whether a year is: 
		//Century year or not 
		//AND also check whether it is leap year or not
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the year: ");
	    int year = sc.nextInt();
	    
	    boolean centuryYear = year % 100 == 0;
	    boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    
	    if(centuryYear && leapYear) {
	    	  System.out.println(year + " is a Century and Leap year.");
	    }
	    else if(centuryYear && !leapYear) {
	    	  System.out.println(year + " is a Century year but not Leap year.");
	    }
	    else if(!centuryYear && leapYear) {
	    	  System.out.println(year + " is not a Century year but is a Leap year.");
	    }
	    else {
	    	  System.out.println(year + " is neither Century nor Leap year.");
	    }
	    sc.close();
	}
}
