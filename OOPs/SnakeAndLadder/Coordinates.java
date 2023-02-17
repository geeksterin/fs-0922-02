public class Coordinates {
    int rn;
    int cn;

    Coordinates(int rn, int cn) {
        this.rn = rn;
        this.cn = cn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(rn).append(", ").append(cn).append("]");
        return sb.toString();
    }
}