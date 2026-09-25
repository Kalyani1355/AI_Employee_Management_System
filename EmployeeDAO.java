
import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        String sql =
        "INSERT INTO employees VALUES(?,?,?,?,?)";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            ps.setInt(5, emp.getAttendance());

            ps.executeUpdate();

            System.out.println(
                    "Employee Added Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void viewEmployees() {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM employees");

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getDouble(4) + " | " +
                        rs.getInt(5));
            }

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}