package behavioural.strategy;

public class GoogleMaps {

    public void findPath(String from, String to){
//        if(mode == ...){
//
//        }else if(mode == ...){
//
//        }else {
//
//        } -> violates SRP, O/C P

        PathCalculator pathCalculator = PathCalculatorStrategy.getPathCalculatorByMode("car");

        pathCalculator.findPath(from, to);
    }
}
