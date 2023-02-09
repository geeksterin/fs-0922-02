import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        
        // Influencer raftar = new Influencer("Raftaar", 340, 400, "Yes", 7, 200, "Rapper", 'M');
        // Influencer rachel = new Influencer("Rachel Gupta", 550, 350, "Yes", 15, 10, "Artist", 'M');
        // Influencer nikhil = new Influencer("Nikhil Chinapa", 500, 220, "Yes", 5, 210, "VJ", 'M');
        // Influencer basheer = new Influencer("Baseer", 500, 120, "No", 2, 230, "VJ", 'M');
        Influencer[] arr = new Influencer[100];
        System.out.println(raftar);
        System.out.println(rachel);
        System.out.println(nikhil);
        System.out.println(basheer);
    }
}

class Influencer {
    String name;
    int posts;
    int reels;
    String bt;
    int followers;
    int followings;
    String category;
    char gender;
    
    Influencer(String name, int posts, int reels, String bt, int followers, int followings, String category, char gender) {
        this.name = name;
        this.posts = posts;
        this.reels = reels;
        this.bt = bt;
        this.followers = followers;
        this.followings = followings;
        this.category = category;
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append(this.posts).append("\n");
        sb.append(this.reels).append("\n");
        sb.append(this.bt).append("\n");
        sb.append(this.followers).append("\n");
        sb.append(this.followings).append("\n");
        sb.append(this.category).append("\n");
        sb.append(this.gender);
        return sb.toString();
    }
}

ArrayList
Stack
Queue