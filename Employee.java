public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int attendance;

    public Employee(int id, String name,
                    String department,
                    double salary,
                    int attendance) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAttendance() {
        return attendance;
    }
}