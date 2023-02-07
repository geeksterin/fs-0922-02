class Rect {
    int length;
    int breadth;
    int x = 5;
    Rect() {
        System.out.println("Rect class, non param constructor");
    }

    Rect(int length, int breadth) {
        System.out.println("Rect class, param constructor");
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return this.length * this.breadth;
    }
}

class Cuboid extends Rect {
    int height;
    int x = 7;
    Cuboid() {
        System.out.println("Cuboid class, non param constructor");
    }  

    Cuboid(int length, int breadth, int height) {
        // System.out.println("Cuboid class, param constructor");
        super(length, breadth);
        Rect rect = new Rect(1, 2);
        // this.length = length;
        // this.breadth = breadth;
        this.height = height;
    }

    int volume() {
        return this.area() * this.height;
    }

    void print() {
        System.out.println(this.x); // => same class variable
        System.out.println(super.x);// => parent class variable
    }
}

public class RectCubeDemo {
    public static void main(String[] args) {
        // Rect r = new Rect(10, 20);
        // System.out.println(r.area());

        Cuboid c = new Cuboid(10, 20, 30);
        System.out.println(c.volume());
    }
}