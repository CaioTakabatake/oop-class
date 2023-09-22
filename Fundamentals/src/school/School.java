package school;

public class School {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Moises", "moises@gmail.com", 30, Gender.MALE, true);
        Student s1 = new Student("Caio", "caio@gmail.com", 17, Gender.MALE, "4296");

        Teacher t2 = new Teacher("Sabugo", "sabugo@yahoo.com", 30, Gender.FEMALE, true);
        Student s2 = new Student("Linguiço", "linguico@yahoo.com", 17, Gender.FEMALE, "250i812095awkjdn");

        System.out.println("Teacher t1:\n" + t1);
        System.out.println("Student s1:\n" + s1);
        System.out.println("Teacher t2:\n" + t2);
        System.out.println("Student s2:\n" + s2);

        System.out.println("Check Email Domains and Full Time Dedication:");
        System.out.println("t1: Gmail Domain? " + t1.checkGmailDomain());
        System.out.println("t1: Yahoo Domain? " + t1.checkYahooDomain());
        System.out.println("t1: Full Time Dedication? " + t1.isFullTimeDedication());
        System.out.println("t2: Gmail Domain? " + t2.checkGmailDomain());
        System.out.println("t2: Yahoo Domain? " + t2.checkYahooDomain());
        System.out.println("t2: Full Time Dedication? " + t2.isFullTimeDedication());
        System.out.println("s1: Gmail Domain? " + s1.checkGmailDomain());
        System.out.println("s1: Yahoo Domain? " + s1.checkYahooDomain());
        System.out.println("s1: Quantity RA? " + s1.quantityRA());
        System.out.println("s2: Gmail Domain? " + s2.checkGmailDomain());
        System.out.println("s2: Yahoo Domain? " + s2.checkYahooDomain());
        System.out.println("s2: Quantity RA? " + s2.quantityRA());
    }
}
