package structural.decorator.icecream;

public class ChocolateScoop implements IceCreamCone{

    private IceCreamCone iceCreamCone;

    public ChocolateScoop(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public int getCost() {
        return this.iceCreamCone.getCost() + 20;
    }

    @Override
    public String getConstitutes() {
        return this.iceCreamCone.getConstitutes() + " " +"ChocolateScoop";
    }
}
