package designPattern.decorator;

// this is just a base, cant be used as topping
public class OrangeCone implements IceCream{

    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
