package creational.factory.tax;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails){
        return TaxCalculatorFactory
                .getTaxAlgorithm(regime)
                .calculateTax(salaryDetails);
    }
}
