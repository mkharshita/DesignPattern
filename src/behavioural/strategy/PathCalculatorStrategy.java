package behavioural.strategy;

public class PathCalculatorStrategy {
    public static PathCalculator getPathCalculatorByMode(String mode){
        if(mode.equals("car")){
            return new CarPathCalculator();
        } else if (mode.equals("walk")){
            return new WalkPathCalculator();
        } else {
            return new BikePathCalculator();
        }
    }
}
