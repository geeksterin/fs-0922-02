class TV {
    void ON () {
        System.out.println("Switched ON Old TV : 10secs");
    }

    void OFF() {
        System.out.println("Switched OFF Old TV: 5secs");
    }

    void CC() {
        System.out.println("Doordarshan OP");
    }
}

class ShmartTV extends TV{
    @Override
    void ON() {
        System.out.println("Switched ON new TV : 1secs");
    }

    @Override
    void OFF() {
        System.out.println("Switched OFF new TV: 0.5secs");
    }

    @Override
    void CC() {
        System.out.println("Discovery OP");
    }

    void netflix() {
        System.out.println("Dhu dhum");
    }
}

public class Eshmart {
    public static void main(String[] args) {
        TV box = new ShmartTV();
        box.OFF();
        box.ON();
        box.CC();
        // box.netflix();
    }
}