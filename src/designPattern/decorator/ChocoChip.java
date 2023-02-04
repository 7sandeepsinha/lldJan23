package designPattern.decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Choco chips";
    }
}
