package Tema6;

public class MainUser {
    public static void main(String[] args) {
        User user = new User("MariaA", "Maria", "Atanasiu");
        System.out.println(user.generateDisplayName());
        user.setUsername("AlexP");
        user.setFirstName("Alexandru");
        user.setLastName("Pavel");
        System.out.println(user.generateDisplayName());

    }

}
