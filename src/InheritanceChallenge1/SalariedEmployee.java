package InheritanceChallenge1;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
//        return (int) annualSalary / 26;
        double paycheck = annualSalary / 26;
        double adjustedPay = isRetired ? paycheck * 0.9 : paycheck;
        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/01/2022");
        isRetired = true;
    }
}
