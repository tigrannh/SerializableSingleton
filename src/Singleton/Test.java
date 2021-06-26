package Singleton;

public class Test {
    public static void main(String[] args) {
        User user = User.getInstance();
        UserService.serializeUser(user);
        System.out.println(user);

        User user2 = UserService.deserializeUser();
        System.out.println(user2);
        System.out.println(user.hashCode() == user2.hashCode());

        user2.setLogin("seePassword");
        user2.setPassword("seeLogin");

        System.out.println(user);
        System.out.println(user2);

    }
}
