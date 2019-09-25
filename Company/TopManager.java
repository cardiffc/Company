package Company;

public class TopManager extends Employees implements Employee {
    public TopManager (int id, double baseSalary, double income)
    {
        this.position = "TopManager";
        this.baseSalary = Math.random() * baseSalary;
        this.addPercent = 30;
        this.monthSalary = income > 8000000 ?  this.baseSalary + (this.baseSalary / 100 * addPercent) : this.baseSalary;
        this.id = id;
    }

    @Override
    public double getPlusIncome() {
        return 0;
    }

}
