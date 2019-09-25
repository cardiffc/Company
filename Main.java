import Company.Company;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Company newCompany = new Company();
        newCompany.setNewSalesManager(200,  5000, newCompany);
        newCompany.setNewTopManager(10,  70000);
        newCompany.setNewOperationist(60,  3000);

        Collections.sort(newCompany.employees);
        System.out.println((int) newCompany.getIncome());
        for (int i = 0; i < 50 ; i++) {
            newCompany.removeEmployee(i);
        }

        newCompany.getTopSalaryStaff(5);
        newCompany.getLowestSalaryStaff(5);

        System.out.println("Доход компании: " + (int) newCompany.getIncome());
    }
}
