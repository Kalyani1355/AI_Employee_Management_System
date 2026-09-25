import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao =
                new EmployeeDAO();

        while(true) {

            System.out.println(
            "\n===== EMPLOYEE MANAGEMENT =====");

            System.out.println(
            "1.Add Employee");

            System.out.println(
            "2.View Employees");

            System.out.println(
            "3.Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name =
                            sc.nextLine();

                    System.out.print(
                    "Department: ");

                    String dept =
                            sc.nextLine();

                    System.out.print(
                    "Salary: ");

                    double salary =
                            sc.nextDouble();

                    System.out.print(
                    "Attendance: ");

                    int att =
                            sc.nextInt();

                    dao.addEmployee(
                    new Employee(
                    id,
                    name,
                    dept,
                    salary,
                    att));

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.exit(0);
            }
        }
    }
}
