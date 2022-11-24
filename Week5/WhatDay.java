package Week5;
/*Isaac Levine
 * 9/17
 * CSE007 Fall 2022: HW 3 
 * The purpose of this program is to output the day of the week of a certain date, which is inputted by the user 
 */
import java.util.Scanner;

public class WhatDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date = "";
        boolean dateFormat = false;

        System.out.println("Enter a date in this format: mm/dd/yyyy");
        while (!dateFormat) {
            if (!scan.hasNext()) { // Checks if the date is not a string
                System.out.println("This entry was not accepted. Enter a date in this format: mm/dd/yyyy");
                date = scan.nextLine();
            } if (scan.hasNext()) {
                date = scan.nextLine();
                if (date.length() != 10) {  // Checks if the date entry is the right length, matching the length of mm/dd/yyyy
                    System.out.println("This entry was not accepted. Make sure your date in this format: mm/dd/yyyy");
                } else {
                    dateFormat = true;
                }
            }
        }
        
        date = date.replace("/",""); // Removes slashes from the date string
        int month = Integer.valueOf(date.substring(0,2)); // Turns string into integer and assigns month to the first 2 numbers of the new date string
        int day = Integer.valueOf(date.substring(2,4)); // Turns string into integer and assigns day to the second 2 numbers of the new date string
        int year = Integer.valueOf(date.substring(4,8)); // Turns string into integer and assigns year to the last 4 numbers of the new date string
        
        if (month < 1 || month > 12) { // Checks if month is the correct range
            do {
                System.out.println("The month you entered is not valid. Please retry in this format from 01-12: mm");
                month = scan.nextInt();
            } while (month < 1 || month > 12);
        } if (day < 1 || day > 31) { // Checks if day is the correct range
            do {
                System.out.println("The day you entered is not valid. Please retry in this format from 01-31: dd");
                day = scan.nextInt();
            } while (day < 1 || day > 31);
        } if (year < 1700 || year > 2399) { // Checks if year is the correct range
            do {
                System.out.println("The year you entered is not valid. Please retry in this format from 1700-2399: yyyy");
                year = scan.nextInt();
            } while (year < 1700 || year > 2399);
        }
        
        int yearCode = ((year % 100) + (year % 100) / 4) % 7; // year % 100 returns the last 2 digits of the year
        int monthCode = 0;
        switch(month){ // Assigns month code based on which month the date is
            case(1): monthCode = 0; break;
            case(2): monthCode = 3; break;
            case(3): monthCode = 3; break;
            case(4): monthCode = 6; break;
            case(5): monthCode = 1; break;
            case(6): monthCode = 4; break;
            case(7): monthCode = 6; break;
            case(8): monthCode = 2; break;
            case(9): monthCode = 5; break;
            case(10): monthCode = 0; break;
            case(11): monthCode = 3; break;
            case(12): monthCode = 5; break; 
            default: break;
        } 
        int centuryCode = 0;
        int century = year / 100; // year / 100 returns the first 2 digits of the year
        switch (century){ // Assigns century code based on which century the date is
            case (17): centuryCode = 4; break;
            case (18): centuryCode = 2; break;
            case (19): centuryCode = 0; break;
            case (20): centuryCode = 6; break;
            case (21): centuryCode = 4; break;
            case (22): centuryCode = 2; break;
            case (23): centuryCode = 0; break;
            default: break;
        }
        int dateNumber = day;
        int leapYearCode = 0; 
        if (year % 4 == 0 ) { // Checks if the year is divisible by 4
            if (year % 100 == 0 && year % 400 != 0) { //Checks if the year is divisible by 100 and not 400
                leapYearCode = 0;
            } else {
                leapYearCode = 1;
            }
        }
        
        int dayFormula = (yearCode + monthCode + centuryCode + dateNumber - leapYearCode) % 7;
        String dayOfWeek = "";
        switch (dayFormula) {
            case(0): dayOfWeek = "Sunday"; break;
            case(1): dayOfWeek = "Monday"; break;
            case(2): dayOfWeek = "Tuesday"; break;
            case(3): dayOfWeek = "Wednesday"; break;
            case(4): dayOfWeek = "Thursday"; break;
            case(5): dayOfWeek = "Friday"; break;
            case(6): dayOfWeek = "Saturday"; break;
            default: break;
        } System.out.println("This date is on a " + dayOfWeek);

        scan.close();
    }
}