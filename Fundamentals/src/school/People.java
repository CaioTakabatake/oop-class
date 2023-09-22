package school;

public class People implements ValidatePeople {
    private String name;
    private String email;
    private int age;
    private String gender;

    public People(String name, String email, int age, Gender gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender.getGender();
    }

    public boolean checkLegalAge() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean checkGmailDomain() {
        return email.contains("@gmail.com");
    }

    @Override
    public boolean checkYahooDomain() {
        return email.contains("@yahoo.com");
    }
}
