package designPattern.strategy;

import constructorChaining.B;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{

    private static BikePathCalculatorStrategy instance;

    private BikePathCalculatorStrategy() {
    }

    public static BikePathCalculatorStrategy getInstance(){
        if(instance == null){
            instance = new BikePathCalculatorStrategy();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Bike");
    }
}
