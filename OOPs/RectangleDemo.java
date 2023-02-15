class Rect {
    private int length;
    private int breadth;
    public ArrayList<Integer> arr = new ArrayList<>();
    public void setLength(int length) {
        if(length < 0) {
            System.out.println("Error, length can't be -ve!!");
            return;
        }
        this.length = length;
    }
   
    public void setBreadth(int breadth) {
        if(breadth < 0) {
            System.out.println("Error, breadth can't be -ve!!");
            return;
        }
        this.breadth = breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setLength(-5);
        rect.setBreadth(-5);
        System.out.println(rect.length);
        rect.arr.add(5);
        int x = rect.arr.get(0);

        ArrayList<Integer> copy = new ArrayList<>(rect.arr);
    }
}