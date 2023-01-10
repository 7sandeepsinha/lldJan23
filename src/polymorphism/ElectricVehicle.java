package polymorphism;

public class ElectricVehicle extends Vehicle{

    @Override // this annotation only checks if method overridden and used for reading purpose
    public void startEngine(){
        System.out.println("Starting electric vehicle");
    }

    public void startCar(){

    }
}
