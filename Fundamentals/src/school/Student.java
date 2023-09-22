package school;

public class Student extends People {
    private String ra;

    public Student(String name, String email, int age, Gender gender, String ra) {
        super(name, email, age, gender);
        this.ra = ra;
    }

    @Override
    public boolean checkLegalAge() {
        return super.checkLegalAge();
    }

    public int quantityRA() {
        return ra.length();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student{" +
                "ra='" + ra + '\'' +
                '}';
    }
}
