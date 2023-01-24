class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftBound = nextSmallerLeft(heights, n);
        int[] rightBound = nextSmallerRight(heights, n);

        int max = 0;

        for(int i = 0; i < n; i ++) {
            int height = heights[i];
            int width = rightBound[i] - leftBound[i] - 1;

            int area = height * width;
            max = area > max ? area : max;
        }

        return max;

    }

    public int[] nextSmallerLeft(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i ++) {
            int ele = arr[i];
            while(!st.isEmpty() && arr[st.peek()] >= ele) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] nextSmallerRight(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i --) {
            int ele = arr[i];
            while(!st.isEmpty() && arr[st.peek()] >= ele) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
}