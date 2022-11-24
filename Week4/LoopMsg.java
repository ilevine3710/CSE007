package Week4;
/*Isaac Levine
 * 9/14
 * CSE007 Fall 2022: Participation Week 4 
 * The purpose of this program is to prompt the user to enter a random number of abbreviations and print what they mean 
 */

import java.util.Scanner;

public class LoopMsg {
    public static void main(String[]args){
      Scanner scnr = new Scanner(System.in);
   
      String userString;   
      int numOfEntries = (int)((Math.random()*10)+1); // Creates random number between 1 and 10

      System.out.println("You will need to enter " + numOfEntries + " abbreviation(s)."); 

      do {
         System.out.println("Abbreviations left: " + numOfEntries);
         System.out.println("Input an abbreviation:");
         userString = scnr.next();
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
               System.out.println("UNKNOWN");
               break;  
         } 
      numOfEntries-= 1;
      } while (numOfEntries>0); // Repeats loop until the number of entries has been reached

      scnr.close(); // Closes the scanner
      }
   }