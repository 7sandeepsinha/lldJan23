package accessModifierAndConstructors;

public class Client {
    public static void main(String[] args) {
        // ClassName objName = new Constructor();
        Student studentObj = new Student(10, "Harshit");

        Student risha = new Student(12, "Risha", 87.23);
        Student aditya = new Student(risha); // -> deep copy
        //Student aditya = risha; -> shallow copy
        aditya.name = "Aditya";
        risha.name = "Kiran";

        System.out.println("Risha id - " + risha.id);
        System.out.println("Aditya id - " + aditya.id);

        System.out.println("Risha name - " + risha.name);
        System.out.println("Aditya name - " + aditya.name);

    }
}
