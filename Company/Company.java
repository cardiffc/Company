package Company;

import java.util.ArrayList;

public class Company {


    public ArrayList<Employees> employees = new ArrayList<Employees>();
    private double income;
    private int employeesCount;
    public Company ()
    {
        this.income = 0;
        this.employeesCount = 0;
    }
    public double getIncome()
    {
        return income;
    }
    public void setIncome (double income)
    {
        this.income += income;
    }
    public void setNewSalesManager (int count, double baseSalary, Company company)
    {
        for (int i = 0; i < count ; i++) {
            employeesCount++;
         //  double persIncome = Math.random() * 100000;
            employees.add(new SalesManager(employeesCount, baseSalary, company));
          //  this.income += persIncome;
        }
    }
    public void setNewTopManager (int count, double baseSalary)
    {
        for (int i = 0; i < count ; i++) {

            employeesCount++;
            employees.add(new TopManager(employeesCount, baseSalary, this.income));
        }
    }
    public void setNewOperationist (int count, double baseSalary)
    {
        for (int i = 0; i < count; i++) {
            employeesCount++;
            employees.add(new Operationist(employeesCount, baseSalary));
        }
    }
    public void removeEmployee (int id) //уволить сотрудника с заданным ID
    {
        for (int i = 0; i < employees.size() ; i++) {
            if (employees.get(i).getId() == id)
            {
                if (employees.get(i).getPosition().equals("SalesManager"))
                {
                    this.income -= employees.get(i).getPlusIncome();
                }
                employees.remove(i);
            }
        }
    }
    public void getTopSalaryStaff(int count)
    {
        System.out.println("====================TOP " + count + " SALARY STAFF===================================================");
        for (int i = 1; i <= count ; i++) {
            int id = employees.size() - i;
            System.out.println("ID: " + employees.get(id).getId() + " - " + employees.get(id).getPosition() + " - " + (int) employees.get(id).getMonthSalary());

        }
        System.out.println("=========================================================================================");
    }
    public void getLowestSalaryStaff(int count)
    {
        System.out.println("====================LOWEST " + count + " SALARY STAFF================================================");
        for (int i = 0; i < count ; i++) {
            //int id = empl.size() - i;
            System.out.println("ID: " + employees.get(i).getId() + " - " + employees.get(i).getPosition() + " - " + (int) employees.get(i).getMonthSalary());

        }
        System.out.println("=========================================================================================");
    }
}
