package Week3;
/*Isaac Levine
 * 9/5
 * CSE007 Fall 2022: Class Participation 3
 * The purpose of this program is to print a season of a specific date, given the month and day as the input, using nested switch Statements
*/
import java.util.Scanner;

public class SeasonsSwitch {
    public static void main(String[] args) {

        // Creates an input for the user to enter the month and day
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a date in this format: (Month, day)");
        String month = scnr.next();
        int day = scnr.nextInt();

        // Removes comma from the string "month" if present
        month = month.replace(",","");

        // Print statement before the season
        System.out.print("The "+day+" of "+month+" falls in ");

        // Uses switch and case statements, as well as nested if statements, to print the season of a corresponding date
        switch (month) {
            case "January":
            case "February":
            case "March":
                switch(day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                        System.out.println("Winter"); 
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        System.out.println("Spring");
                        break;
                }
            break;
            case "April":
            case "May":  
            case "June":
                switch(day) {
                  case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                    case 20:
                        System.out.println("Spring");
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        System.out.println("Summer");
                        break;
                }
            break;
            case "July":
            case "August":
            case "September":
                switch(day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                    case 20:
                    case 21:
                        System.out.println("Summer");
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        System.out.println("Fall");
                        break;
                }
            break;
            case "October":
            case "November":
            case "December":
                switch(day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19: 
                    case 20:
                        System.out.println("Fall");
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        System.out.println("Winter");
                        break;  
                }    
            break;  
            }

        //Closes the scanner
        scnr.close();     
    }
}
