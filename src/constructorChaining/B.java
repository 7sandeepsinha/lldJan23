package constructorChaining;

public class B extends A{
    int b;

    public B(int a, int b) {
        System.out.println("B starts here");
        this.b = b;
        System.out.println("B ends here");
    }
}
