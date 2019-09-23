package Company;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Company {
    public ArrayList<Employees> empl = new ArrayList<Employees>();
    private double income;
    private int employeesCount;
    public Company ()
    {
        this.income = 0;
        this.employeesCount = 0;

    }

    public double getIncome ()
    {
        return this.income;
    }

    public void setNewSalesManager (int count, double baseSalary)
    {
            for (int i = 0; i < count ; i++) {
            employeesCount++;
            double persIncome = Math.random() * 100000;
            empl.add(new SalesManager(employeesCount, baseSalary, persIncome));
            this.income += persIncome;
            }
    }
    public void setNewTopManager (int count, double baseSalary)
    {
        for (int i = 0; i < count ; i++) {

            employeesCount++;
            empl.add(new TopManager(employeesCount, baseSalary, this.income));
        }
    }
    public void setNewOperationist (int count, double baseSalary)
    {
        for (int i = 0; i < count; i++) {
            employeesCount++;
            empl.add(new Operationist(employeesCount, baseSalary));
        }
    }

    public void removeEmployee (int id) //уволить сотрудника с заданным ID
    {
        for (int i = 0; i < empl.size() ; i++) {
            if (empl.get(i).getId() == id)
            {
                empl.remove(i);
            }

        }

    }
    public void getTopSalaryStaff(int count)
    {
        System.out.println("=========================================================================================");
        for (int i = 1; i <= count ; i++) {
            int id = empl.size() - i;
            System.out.println(empl.get(id).getId() + " - " + empl.get(id).getPosition() + " - " + (int) empl.get(id).getMonthSalary());

        }
        System.out.println("=========================================================================================");
    }
    public void getLowestSalaryStaff(int count)
    {
        for (int i = 0; i < count ; i++) {
            //int id = empl.size() - i;
            System.out.println(empl.get(i).getId() + " - " + empl.get(i).getPosition() + " - " + (int) empl.get(i).getMonthSalary());

        }
    }
}
