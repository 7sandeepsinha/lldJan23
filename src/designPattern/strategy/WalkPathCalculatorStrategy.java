package designPattern.strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    private static WalkPathCalculatorStrategy instance;

    private WalkPathCalculatorStrategy() {
    }

    public static WalkPathCalculatorStrategy getInstance(){
        if(instance == null){
            instance = new WalkPathCalculatorStrategy();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Walking");
    }
}
