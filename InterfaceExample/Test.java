public class Test {
    public static void main(String[] args) {
        StudentNumberProvider agent1 = new StudentNumberProvider();
        CorporateEmployeeNumberProvider agent2 = new CorporateEmployeeNumberProvider();
        NewCompanyDataProvider agent3 = new NewCompanyDataProvider();
        Consumer consumer = new Consumer(agent3);
        consumer.sendAdvertisement();
    }
}