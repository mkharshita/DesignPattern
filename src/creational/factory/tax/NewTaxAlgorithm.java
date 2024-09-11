package creational.factory.tax;

//Step - 2 : Create Concrete Class
public class NewTaxAlgorithm implements TaxAlgorithm {
    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay() + 0.2 * salaryDetails.getHra() +
                0.3 * salaryDetails.getLta();
    }
}
