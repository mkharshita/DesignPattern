package factory.tax;

//Step - 3 : Create Factory
public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime){
        switch (regime) {
            case OLD :
                return new OldTaxAlgorithm();
            case NEW :
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("Invalid Regime " + regime);
    }
}
