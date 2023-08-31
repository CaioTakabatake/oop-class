package oop;

public class Client implements MovieRental, CustomerRegistration {
    private String name;
    private String email;

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double calculateRental(int numberOfDays) {
        return numberOfDays * 3.99;
    }

    public double calculateRental(int numberOfDays, boolean isNewRelease) {
        return numberOfDays * 6.99;
    }

    @Override
    public boolean validateName(String name) {
        if (name.length() > 7) {
            System.out.println("Customer name: " + name + " is valid ✅");
            return true;
        } else {
            System.out.println("Customer name: " + name + " is invalid ❌");
            return false;
        }
    }

    @Override
    public boolean checkGoogleEmailDomain(String email) {
        if (email == null) {
            System.out.println("Email is null");
            return false;
        }

        if (email.contains("@gmail.com")) {
            System.out.println("Customer email: " + email + " is valid ✅");
            return true;
        } else {
            System.out.println("Customer email: " + email + " is invalid ❌");
            return false;
        }
    }

    @Override
    public String toString() {
        if (this.email == null) {
            return "Client{" +
                    "name='" + name + '\'' +
                    '}';
        } else {
            return "Client{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}
