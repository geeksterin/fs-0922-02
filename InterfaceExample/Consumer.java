import java.util.*;
public class Consumer {
    INumberProvider provider;
    Consumer(INumberProvider provider) {
        this.provider = provider;
    }

    public void sendAdvertisement(){
        for(String num : provider.getPhNums()) {
            System.out.println("Sending advertisement to: " + num);
        }
    }
}