package accessModifierAndConstructors;

public class Student {
    public int id;
    public String name;
    public int roll;
    public double percentage;
    public boolean pass;

/*    no-args constructor
    public Student(){
        id = 100;
        name = "RANDOM";
        roll = 100;
        percentage = 100;
    }
*/

    //Constructor Overloading -> when we have multiple types of constructor inside a class
    public Student() {
    }

    //custom constructor, or, parameterised/args constructor
    public Student(int studentId, String studentName){
        id = studentId;
        name = studentName;
    }

    public Student(int studentId, String studentName, double studentPercentage){
        System.out.println("Hello world");
        id = studentId;
        name = studentName;
        percentage = studentPercentage;
        if(studentPercentage > 40){
            pass = true;
        }else {
            pass = false;
        }
    }

    //copy constructor
    public Student(Student s){
        name = s.name;
        id = s.id;
        roll = s.roll;
        percentage = s.percentage;
        pass = s.pass;
    }

}

// Default constructor is the constructor provided by lang/compiler when we dont add
// any constructor to the class. It initialises all the attributes to their default values.

// No-arg constructor is created by user, and might initialise the attribute values
// to something other than default.

