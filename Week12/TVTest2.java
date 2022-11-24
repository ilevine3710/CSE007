import java.util.Arrays;

public class TVTest2 {
    public static void main(String[] args) {
        TVShow2 [] lineup = new TVShow2 [5];
        fillArray(lineup);
        System.out.println(Arrays.toString(lineup));
        airTime(lineup);
        displayLineup(lineup);
    }
    public static void fillArray(TVShow2 [] array) {
        array [0] = new TVShow2("Over the Garden wall","Hulu","adventure-comedy",40);
        array [1] = new TVShow2("Breaking Bad","Netflix","Drama", 55.6);
        array [2] = new TVShow2("Game of Thrones", "HBO", "Drama", 67.8);
        array [3] = new TVShow2("Seinfeld","Netflix","Comedy",23.5);
        array [4] = new TVShow2("Modern Family","Hulu","Comedy",22.4);

    }
    public static void airTime(TVShow2 [] array) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) ((Math.random() * 95) + 1);
            airTime(array[i],random);
        }
    } 
    public static void airTime(TVShow2 tv, int episodes) {
        tv.setEpisodes(episodes);
    
    }
    public static void displayLineup(TVShow2 [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("# of Shows: " + TVShow2.getShows());
            System.out.println("\tShow Name: " + array[i].getName());
            System.out.println("\tNumber of Episodes: " + array[i].getEpisodes());
            System.out.println("\tTotal Airtime: " + array[i].getTotalAirtime());
        }
    } 
}
