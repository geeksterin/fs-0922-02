import java.util.*;
public class Dice {
    public static int roll() {
        int MIN = 1, MAX = 6;
        double r = Math.random();
        int num = (int)(r * MAX) + MIN;
        return num;
    }
}