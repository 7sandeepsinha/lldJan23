package designPattern.decorator;

//can be both base and topping
public class VanillaCone implements IceCream{
    private IceCream iceCream;

    //when vanilla cone is the base -> 1st item in icecream
    public VanillaCone() {
    }

    //when vanilla cone is a topping -> not 1st item in icecrem
    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 50;
        }
        return 50;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " Vanilla Cone";
        }
        return "Vanilla Cone";
    }
}
