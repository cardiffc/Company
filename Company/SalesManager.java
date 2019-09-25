package Company;

public class SalesManager extends Employees implements Employee {
    private double personalIncome;
    private double plusIncome;
    public SalesManager (int id, double baseSalary, Company company)
    {
        this.personalIncome = Math.random() * 100000;
        this.position = "SalesManager";
        this.addPercent = 0.5;
        this.monthSalary = Math.random() * baseSalary + (personalIncome / 100 * addPercent);
        this.plusIncome = personalIncome - monthSalary;
        this.id = id;
        company.setIncome(plusIncome);

    }

    @Override
    public double getPlusIncome() {
        return this.plusIncome;
    }
}
