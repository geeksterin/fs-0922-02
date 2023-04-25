import java.util.*;
public class StudentNumberProvider implements INumberProvider{
    String[] studentData = {
        "Omkar-Kore-Maharashtra-7574653636-BTech",
        "Nitish-Kumar-Maharashtra-5676567898-BTech", 
        "Ajay-Mohan-Maharashtra-8587476357-BTech",
        "Aniruddha-Rahane-Maharashtra-8767575674-BTech"
    };

    @Override
    public List<String> getPhNums() {
        List<String> phNos = new ArrayList<>();
        for(String str : studentData) phNos.add(str.split("-")[3]);
        return phNos;
    }
}