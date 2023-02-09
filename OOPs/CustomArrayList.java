public class CustomArrayList {
    int cap;
    int[] arr;
    int nel; //next element location;

    CustomArrayList() {
        cap = 10;
        arr = new int[cap];
        nel = 0;
    }

    public void add(int ele) {
        if(nel == cap) grow();
        this.arr[this.nel ++] = ele;
    }

    public int size() {
        return this.nel;
    }

    public void remove() {
        if(nel == 0) {
            System.out.println("No elements to remove");
            return;
        }
        this.nel --;
    }

    public void remove(int idx) {

    }

    private void grow() {
        System.out.println("GROW CALLED");
        //double the capacity
        cap *= 2;
        // make a new array
        int[] temp = new int[cap];
        // copy old stuff
        for(int i = 0; i < arr.length; i ++) temp[i] = arr[i];
        // arr now points to the new array
        arr = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.size(); i ++)sb.append(arr[i]).append(", ");
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

}