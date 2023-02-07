public class BankCustomer{
    private String name;
    private String fathersName;
    private int aadhar;
    private int accBalance;
    private String mobNo;
    private int ifsc;

    public BankCustomer(String name, String fathersName, int aadhar, String mobNo) {
        this.name = name;
        this.fathersName = fathersName;
        this.aadhar = aadhar;
        this.accBalance = 0;
        this.mobNo = mobNo;
        this.ifsc = 45678;
    }

    public String getName() {
        return this.name;
    }

    public String getFathersName() {
        return this.fathersName;
    }
    
    public void setName(String name) {
        if(this.name != null || name == null || name.length() < 2) {
            System.out.println("Enter a valid name");
            return;
        }
        this.name = name;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setMobNo(String mobNo) {
        if(mob.length() != 10)
    }

    public void deposit(int money) {
        System.out.println("Prev Bal " + accBalance);
        accBalance += money;
        System.out.println("New Bal " + accBalance);
    }

    public void withdraw(int money) {
        if(money < 0) {
            System.out.println("Don't be clever!!");
            return;
        }

        if(money >  accBalance) {
            System.out.println("Insufficient Balance!!");
            return;
        }

        System.out.println("Prev Bal " + accBalance);
        accBalance -= money;
        System.out.println("New Bal " + accBalance);
    }
}