package Employee_Managementv2;

import Employee_Managementv2.Classes.Company;
import Employee_Managementv2.Classes.Department;
import Employee_Managementv2.Classes.Employee;
import Employee_Managementv2.Services.Service;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = DataInitializer.createCompany();
        Service service = new Service(company);

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\nWelcome to "+company.getCompanyName()+ "'s Employee Management System !!");
            System.out.println("What would you like to do?\n" +
                    "1. Find the most salaried Person\n" +
                    "2. Find all employees department wise\n" +
                    "3. Find employees with same name\n" +
                    "4. Find employees under a manager\n");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    service.findMostSalaried();
                    break;

                case 2:
                    service.groupByDepartment();
                    break;

                case 3:
                    service.findEmployeeWithSameName();
                    break;

                case 4:
                    System.out.println("Enter manager name: ");
                    String managerName = sc.nextLine();
                    Employee manager = Service.findManager(managerName);
                    if (manager != null) {
                        service.findReporteesOf(manager);
                    } else {
                        System.out.println("Manager not found.");
                    }
                    break;

                case 9:
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Enter a valid choice!!");
                    break;

            }

            if(!exit){
                System.out.println("\nPress 9 to go back to the menu, or 0 to exit.");
                int continueChoice = Integer.parseInt(sc.nextLine());
                if (continueChoice == 0) {
                    exit = true;
                }
            }

        }
    }
}
