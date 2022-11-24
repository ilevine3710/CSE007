package Week11;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        TVShow tvShow1 = new TVShow("Westworld","HBO",60);
        TVShow tvShow2 = new TVShow();
        tvShow2.name="Spongebob Squarepants";
        tvShow2.network="Nickelodeon";
        tvShow2.length=22;
        TVShow tvShow3 = new TVShow("The Boys", "Amazon", 50);
        TVShow tvShow4 = new TVShow("Game of Thrones", "HBO", 60);
        TVShow tvShow5 = new TVShow("The Office", "NBC", 22);
        TVShow tvShow6 = new TVShow();

        System.out.println("Enter a TV show name");
        tvShow6.name = scan.nextLine();

        System.out.println("Enter the show's network");
        tvShow6.network = scan.nextLine();

        System.out.println("Enter the show's length");
        tvShow6.length = scan.nextInt();

        tvShow1.printShow();
        tvShow2.printShow();
        tvShow3.printShow();
        tvShow4.printShow();
        tvShow5.printShow();
        tvShow6.printShow();

        scan.close();
    }
}
