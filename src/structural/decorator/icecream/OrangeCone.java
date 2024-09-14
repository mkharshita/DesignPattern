package structural.decorator.icecream;

public class OrangeCone implements IceCreamCone{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getConstitutes() {
        return "OrangeCone";
    }
}
