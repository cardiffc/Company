import Company.Company;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Company newCompany = new Company();
        newCompany.setNewSalesManager(200,  5000);
        newCompany.setNewTopManager(10,  70000);
        newCompany.setNewOperationist(60,  3000);
        Collections.sort(newCompany.employees);
        newCompany.getTopSalaryStaff(5);
        newCompany.getLowestSalaryStaff(5);
        System.out.println("Доход компании: " + (int) newCompany.getIncome());
    }
}
