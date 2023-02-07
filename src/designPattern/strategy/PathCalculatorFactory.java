package designPattern.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(String mode){
        return switch (mode) {
            case "Car" -> new CarPathCalculatorStrategy(); //car is not singleton
            case "Bike" -> BikePathCalculatorStrategy.getInstance();
            case "Walk" -> WalkPathCalculatorStrategy.getInstance();
            default -> null;
        };
    }
}
