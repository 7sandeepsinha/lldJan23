package constructorChaining;

public class Client {
    public static void main(String[] args) {
        C c = new C(10,20,30);
        System.out.println(c.c);
        System.out.println(c.a);
        System.out.println(c.b);
    }
}