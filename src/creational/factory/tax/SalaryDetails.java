package creational.factory.tax;

import lombok.Getter;

@Getter
public class SalaryDetails {
    private Double basePay;
    private Double hra;
    private Double lta;

    public Double getBasePay() {
        return basePay;
    }

    public Double getHra() {
        return hra;
    }

    public Double getLta() {
        return lta;
    }
}
