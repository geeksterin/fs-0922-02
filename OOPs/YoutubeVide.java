import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        YoutubeVideo ytv = getNewYTV();
        ytv.printObj();
    }
    
    public static YoutubeVideo getNewYTV() {
        String song = scn.nextLine();
        String artist = scn.nextLine();
        int views = scn.nextInt();
        int likes = scn.nextInt();
        int releasedYear = scn.nextInt();
        int n = scn.nextInt();
        scn.nextLine();
        ArrayList<String> comments = new ArrayList<>();
        for(int i = 0; i < n; i ++) comments.add(scn.nextLine());
        return new YoutubeVideo(song, artist, views, likes, releasedYear, n, comments);
    }
}

class YoutubeVideo {
    String song;
    String artist;
    int views;
    int likes;
    int releasedYear;
    int n;
    ArrayList<String> comments;
    
    YoutubeVideo(String song, String artist, int views, int likes, int releasedYear, int n, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.releasedYear = releasedYear;
        this.n = n;
        this.comments = comments;
    }
    
    public void printObj() {
        System.out.println(this.song);
        System.out.println(this.artist);
        System.out.println(this.views);
        System.out.println(this.likes);
        System.out.println(this.releasedYear);
        System.out.println(this.n);
        for(String comment : this.comments) System.out.println(comment);
    }
}

