package structural.decorator.icecream;

public class BlueCone implements IceCreamCone{

    private IceCreamCone iceCreamCone;

    public BlueCone(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    public BlueCone() {
    }

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getConstitutes() {
        return  "BlueCone";
    }
}
