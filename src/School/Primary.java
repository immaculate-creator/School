package School;

public class Primary{
    private double breakTime;
    private int age;
    private int yearsSpent;

    public Primary(double breakTime, int age, int yearsSpent) {
        this.breakTime = breakTime;
        this.age = age;
        this.yearsSpent = yearsSpent;
    }

    public void setAge() {
        System.out.println("Age for primary school is " + age + " and above");
    }

    public void getBreakTime() {
        System.out.println("break-time varies but mostly from " + breakTime );
    }

    public void setYearsSpent() {
        System.out.println("they start from 3 and run down to " + yearsSpent + " varies for different individual");
    }
}
