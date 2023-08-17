package enumaration;

public class Enumeration {
    public static void main(String[] args) {
        User usuario = new User("User 01", "user01@gmail.com", true, UserTypeEnum.TECHNICAL);

        System.out.println(usuario);

        Order order = new Order("Order User 01", 29.99, StatusEnum.IN_PREPARATION.getStatus());
        System.out.println(order);

        order.setStatus(StatusEnum.IN_TRANSIT.getStatus());
        System.out.println(order);

        order.setStatus(StatusEnum.DELIVERED.getStatus());
        System.out.println(order);

    }
}
