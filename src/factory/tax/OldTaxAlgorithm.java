package factory.tax;

//Step - 2 : Create Concrete Class
public class OldTaxAlgorithm implements TaxAlgorithm {

    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra();
    }
}
