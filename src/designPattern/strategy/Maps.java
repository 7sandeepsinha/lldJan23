package designPattern.strategy;

public class Maps {
    public static void main(String[] args) {
        String mode = "Walk";
        PathCalculatorStrategy p = PathCalculatorFactory.getPathCalculator(mode);
        p.findPath("source", "dest");
    }
}
