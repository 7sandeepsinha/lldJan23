package designPattern.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder()
                    .setId(1)
                    .setGradYear(2021)
                    .setYoe(2)
                    .setPsp(80)
                    .build();
    }
}
/*
    Nested classes ->
    1. Normal nested or inner -> outer class object is needed to call constructor inner class
    2. Static inner class -> no need outer class object, inner class constructor can be called using outer class Name
    3. Local inner class -> inside a method
 */