package com.LeapYear;

public class Leapyear {

	

	//400 for century year
	// if it is divisible by 4 then it is leap year (except century year end wit 00)if not then if it is divisble by 400 then it is leap year 
	//if it is not divible by 100 then it is leap year
	
	
	
	public static void main(String[] args) {

        int year = 200;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

	
	
}
