package structural.decorator.icecream;

public class Customer {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone =
                new VanillaScoop(
                        new ChocolateScoop(
                                new BlueCone()
                        )
                );

        //With 2 blueCone
        IceCreamCone with2BlueCone =
                new VanillaScoop(
                        new ChocolateScoop(
                                new BlueCone(
                                        new BlueCone(
                                                new OrangeCone()
                                        )
                                )
                        )
                );
        System.out.println("Cost Is : " + iceCreamCone.getCost());
        System.out.println("Constitues are : " + iceCreamCone.getConstitutes());

        System.out.println("Cost Is : " + with2BlueCone.getCost());
        System.out.println("Constitues are : " + with2BlueCone.getConstitutes());

    }
}
