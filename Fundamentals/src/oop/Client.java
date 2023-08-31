package oop;

public class Client {
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
