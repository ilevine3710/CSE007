package Week3;
/*Isaac Levine
 * 9/7
 * CSE007 Fall 2022: Class Participation 3
 * The purpose of this program is to use switches to convert an abbreviation to its expression
*/

import java.util.Scanner;

public class SwitchMsg {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        String userString;
        
        // Prompts the user the enter an abbreviation
        System.out.println("Input an abbreviation:");
        userString = scnr.next();

        // Uses switches to match each abbreviation to its expression
        System.out.print(userString + " means ");
        switch(userString) {
            case "fwiw":
               System.out.println("for what it's worth");
               break;
            case "woat":
               System.out.println("worst of all time");
               break;
            case "idrk":
               System.out.println("i don't really know");
               break;
            case "fomo":
               System.out.println("fear of missing out");
               break;
            case "irl":
               System.out.println("in real life");
               break;
            case "lol":
               System.out.println("laughing out loud");
               break;
            case "fr":
               System.out.println("for real");
               break;
            case "smh":
               System.out.println("shake my head");
               break;
            default:
               System.out.println("Unknown");
               break;
         } 

         // Closes the scanner
         scnr.close();
      }
   }