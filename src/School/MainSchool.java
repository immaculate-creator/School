package School;

public class MainSchool{

    public static void main(String[] args) {
        University university = new University("Medicine", 27, 5);
        Secondary secondary = new Secondary("BIOLOGY", 15, 6);
        Primary  primary= new Primary(10.000, 9, 10);

        university.setAge();
        university.setYearsSpent();
        university.setCourses();

        secondary.setAge();
        secondary.setYearsSpent();
        secondary.setSubject();


        primary.setAge();
        primary.setYearsSpent();
        primary.getBreakTime();


    }

}
