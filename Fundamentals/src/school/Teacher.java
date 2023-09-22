package school;

public class Teacher extends People {
    private boolean fullTimeDedication;

    public Teacher(String name, String email, int age, Gender gender, boolean fullTimeDedication) {
        super(name, email, age, gender);
        this.fullTimeDedication = fullTimeDedication;
    }

    public boolean isFullTimeDedication() {
        return fullTimeDedication;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Teacher{" +
                "fullTimeDedication=" + fullTimeDedication +
                '}';
    }
}
