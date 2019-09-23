package Company;

public abstract class Employees implements Employee, Comparable<Employees>
{
    protected double monthSalary;
    protected double baseSalary;
    protected double addPercent;
    protected int id;
    protected String position;
    @Override
    public double getMonthSalary() {
        return monthSalary;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getPosition() {
        return position;
    }
    @Override
    public int compareTo(Employees emp1oyee) {
        if (getMonthSalary() > emp1oyee.getMonthSalary())
        {
            return 1;
        }
        if (getMonthSalary() < emp1oyee.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}
