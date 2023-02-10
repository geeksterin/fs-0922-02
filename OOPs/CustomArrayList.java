public class CustomArrayList {
    int cap;
    private int[] arr;
    int nel; // next element location;

    CustomArrayList() {
        cap = 10;
        arr = new int[cap];
        nel = 0;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int get(int idx) {
        if(idx < 0 || idx >= this.size()){
            System.out.println("No elements to remove");
            return -1;
        }
        return this.arr[idx];
    }

    public void add(int ele) { //O(1)
        if(nel == cap) grow();
        this.arr[this.nel ++] = ele;
    }

    public int size() { // O(1)
        return this.nel;
    }

    public int remove() { // O(1)
        if(nel == 0) {
            System.out.println("No elements to remove");
            return -1;
        }
        return arr[-- this.nel];
    }

    public int remove(int idx) { //O(n)
        if(idx < 0 || idx >= this.size()){
            System.out.println("idx out of bounds");
            return -1;
        }
        for(int i = idx; i < this.size() - 1; i ++) arr[i] = arr[i + 1];
        return arr[-- this.nel];
    }

    private void grow() { // O(n)
        System.out.println("GROW CALLED");
        //double the capacity
        cap *= 2;
        // make a new array
        int[] temp = new int[cap];
        // copy old stuff
        for(int i = 0; i < arr.length; i ++) temp[i] = arr[i];  //O(n)
        // arr now points to the new array
        arr = temp;
    }

    public String toString() { //O(n)
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.size(); i ++)sb.append(arr[i]).append(", ");
        if(sb.length() > 2) sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}