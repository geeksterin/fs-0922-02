import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 1; i <= 5; i ++) st.push(i);
        for(int i : st) System.out.print(i +  " ");
        // System.out.println(st);
        // System.out.println(st.pop());  // 5
        // System.out.println(st.peek()); // 4
        // System.out.println(st.peek()); // 4
        // System.out.println(st.pop()); // 4
        // System.out.println(st.pop()); // 3
        // System.out.println(st.peek()); // 2
        // System.out.println(st.pop()); // 2
        
    }
}