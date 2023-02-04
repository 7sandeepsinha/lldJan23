package designPattern.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocolateScoop(
                            new ChocoChip(
                                new VanillaCone(
                                    new OrangeCone())));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());

    }
}
