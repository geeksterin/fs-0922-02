import java.io.*;
import java.util.*;

public class Solution {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        scn.nextLine();
        Batman[] batmen = new Batman[n];
        for(int i = 0; i < n; i ++) {
            batmen[i] = getBatman();
            batmen[i].printObj();
        }
        // for(Batman bm : batmen) bm.printObj();
    }
    
    public static Batman getBatman() {
        String name = scn.nextLine();
        int rating = scn.nextInt();
        scn.nextLine();
        int moneyCollection = scn.nextInt();
        int profit = scn.nextInt();
        scn.nextLine();
        String leadActor = scn.nextLine();
        String leadActress = scn.nextLine();
        return new Batman(name, rating, moneyCollection, profit, leadActor, leadActress);
    }
}

class Batman{
    String name;
    int rating;
    int moneyCollection;
    int profit;
    String leadActor;
    String leadActress;

    public Batman(String name, int rating, int moneyCollection, int profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActress = leadActress;
        this.leadActor = leadActor;
    }

    public void printObj() {
        System.out.println(this.name);
        System.out.println(this.rating);
        System.out.println(this.moneyCollection);
        System.out.println(this.profit);
        System.out.println(this.leadActor);
        System.out.println(this.leadActress);
    }
}