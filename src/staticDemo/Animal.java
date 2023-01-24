package staticDemo;

public class Animal {
    public int id;
    public String name;
    public static int noOfLegs;

    public void sayHello(){
        System.out.println("Animals says hello");
    }

    public static void eats(){
        System.out.println("Animal is eating");
    }
}
