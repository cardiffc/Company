package Company;

public class SalesManager extends Employees implements Employee {

    public SalesManager (int id, double baseSalary, double personalIncome)
    {
        this.position = "SalesManager";
        this.addPercent = 0.5;
        this.monthSalary = Math.random() * baseSalary + (personalIncome / 100 * addPercent);
        this.id = id;
    }

}
