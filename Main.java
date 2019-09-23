import Company.Company;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Company newCompany = new Company();
            newCompany.setNewSalesManager(1,  5000);
            newCompany.setNewTopManager(70,  70000);
            newCompany.setNewOperationist(100,  3000);

        Collections.sort(newCompany.empl);

        newCompany.getTopSalaryStaff(150);
        newCompany.getLowestSalaryStaff(50);
        }
    }
