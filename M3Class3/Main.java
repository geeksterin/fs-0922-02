import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) arr[i] = scn.nextInt();
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i ++) {
            int ele = arr[i];
            if(st.isEmpty()) {
                ans[i] = -1;
            } else if(st.peek() > arr[i]) {
                ans[i] = st.peek();
            } else {
                while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[i]);
        }
        for(int i : ans) System.out.print(i + " ");
    }
}



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) arr[i] = scn.nextInt();
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i ++) {
            int ele = arr[i];
            while(!st.isEmpty() && st.peek() <= ele) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for(int i : ans) System.out.print(i + " ");
    }
}