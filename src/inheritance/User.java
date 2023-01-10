package inheritance;

public class User {
    public int id;
    public String userName;
    public String password;

    public User() {
        id = 10;
    }

    public void login(){
        System.out.println("User is logging in");
    }

    public void resetPassword(){
        System.out.println("User is resetting password");
    }
}
