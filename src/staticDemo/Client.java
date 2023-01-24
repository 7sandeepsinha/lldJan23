package staticDemo;

public class Client {
    public static void main(String[] args) {
        // instance attributes and methods -> they need object instances for usage
//        Animal a = new Animal();
//        a.id = 10;
//        a.name = "Tiger";
        Animal.noOfLegs = 4;
        Animal.eats();
    }
}

// main is the beginning of code execution, if main is non-static
// it will need an object, to call main.
