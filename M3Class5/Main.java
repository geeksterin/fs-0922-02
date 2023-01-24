import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("India", "1.5B");
        hm.put("China", "1.4B");
        hm.put("USA", "650M");
        hm.put("Canada", "100M");
        hm.put("Germany", "100M");
        System.out.println(hm.get("China"));
        // for(String  key : hm.keySet()) {
        //     System.out.println(key + " -> "+ hm.get(key));
        // }
        System.out.println(hm.getOrDefault("Pakistan", "NotFound"));
        // for()
        // hm.get();
    }
}