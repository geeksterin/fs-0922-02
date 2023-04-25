import java.util.*;
public class NewCompanyDataProvider implements INumberProvider {
    String[] data = {"PH123456789", "Ph987654322", "Ph234567893", "Ph234567678", "Ph2345671234", "Ph234560987"};
    
    public List<String> getPhNums() {
        List<String> phNos = new ArrayList<>();
        for(String str : data) phNos.add(str.substring(2));
        return phNos;
    }
}