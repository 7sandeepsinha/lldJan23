package designPattern.strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Car");
    }
}
