package constructorChaining;

public class C extends B{
    int c;
    public C(int a, int b, int c) {
        super(a, b); //super is always the first line in cons
        System.out.println("C starts here");
        this.c = c;
        System.out.println("C ends here");
    }
}
