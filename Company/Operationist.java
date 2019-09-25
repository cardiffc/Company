package Company;

public class Operationist extends Employees {

    public Operationist (int id, double baseSalary)
    {
        this.position = "Operationist";
        this.monthSalary = Math.random() * baseSalary;
        this.id = id;
    }

    @Override
    public double getPlusIncome() {
        return 0;
    }
}
