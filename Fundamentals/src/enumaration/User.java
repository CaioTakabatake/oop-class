package enumaration;

public class User {
    private String nome;
    private String email;
    private boolean active;
    private UserTypeEnum type;

    public User(String nome, String email, boolean active, UserTypeEnum tipo) {
        this.nome = nome;
        this.email = email;
        this.active = active;
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + nome + ", email=" + email + ", active=" + active + ", type=" + type + '}';
    }
}
