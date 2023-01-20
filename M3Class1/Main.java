import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(5);
        a1.add(9);
        a1.add(12);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(7);
        a2.add(14);
        a2.add(15);
        a2.add(19);
        a2.add(21);
        
        System.out.println(mergeLists(a1, a2));
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int f = 0, s = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(f < a1.size() && s < a2.size()) {
            if(a1.get(f) < a2.get(s)) {
                ans.add(a1.get(f));
                f ++;
            } else {
                ans.add(a2.get(s));
                s ++;
            }
        }
        while(f < a1.size()) ans.add(a1.get(f ++));
        while(s < a2.size()) ans.add(a2.get(s ++));

        return ans;
    }
}