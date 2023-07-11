package School;

public class University {
    private String courses;
    private int age;
    private int yearsSpent;

    public University(String courses, int age, int yearsSpent) {
        this.courses = courses;
        this.age = age;
        this.yearsSpent = yearsSpent;
    }
    public void setCourses(){
        System.out.println("courses offered in university is " + courses );
    }

    public void setAge() {
        System.out.println("age range allowed in the university is " + age + "years");
    }
    public void setYearsSpent(){
        System.out.println(yearsSpent + " years is the length of time spent in university");
    }
}

