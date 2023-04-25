import java.util.*;
public class CorporateEmployeeNumberProvider implements INumberProvider {
    String[] employeeData = {
        "Omkarn Koren 7574653636n BTech",
        "Nitishn Kumarn 5676567898n BTech", 
        "Ajayn Mohann 8587476357n BTech",
        "Aniruddhan Rahanen 8767575674n BTech"
    };

    @Override
    public List<String> getPhNums() {
        List<String> phNos = new ArrayList<>();
        for(String str : employeeData) phNos.add(str.split("n ")[2]);
        return phNos;
    }
}