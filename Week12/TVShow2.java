public class TVShow2 {
    private String name;
    private String stream;
    private String genre;
    double avgLength;
    private int episodes = 0; 
    private static int shows = 0;
    public TVShow2(){
        name = "n/a";
        stream = "n/a";
        genre = "n/a";
        avgLength = 0;
    }
    public TVShow2 (String name, String stream, String genre, double avgLength) {
        this.name = name; 
        this.stream = stream;
        this.genre = genre;
        this.avgLength = avgLength;
        shows++;
    } 
    public void airEpisodes(){
        episodes++;
    } 
    public void airEpisodes(int add) {
        episodes += add;
    } public double getTotalAirtime(){
        return episodes * avgLength;
    } public void setEpisodes(int episodes){ 
        this.episodes = episodes;}        
    public int getEpisodes(){ 
        return episodes;
    } 
    public void setAvgLength(double avgLength){ 
        this.avgLength = avgLength;}        
    public double getAvgLength(){ 
        return avgLength;
    } 
    public void setName(String name){ 
        this.name = name;}        
    public String getName(){ 
        return name;
    } public void setStream(String stream){ 
        this.stream = stream;}        
    public String getStream(){ 
        return stream;
    }public void setGenre(String genre){ 
        this.genre = genre;}        
    public String getGenre(){ 
        return genre;
    } public static int getShows() {
        return shows;
    }
        

}

