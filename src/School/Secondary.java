package School;

public class Secondary {
    private String subject;
    private int age;
    private int yearsSpent;

    public Secondary(String subject, int age, int yearsSpent) {
        this.subject = subject;
        this.age = age;
        this.yearsSpent = yearsSpent;
    }
    public void setSubject(){
        System.out.println("Subject offered in secondary school is " + subject );
    }

    public void setAge() {
        System.out.println("age range allowed in secondary school is " + age + "years");
    }
    public void setYearsSpent(){
        System.out.println(yearsSpent + " years is the length of time spent in secondary school");
    }
}
