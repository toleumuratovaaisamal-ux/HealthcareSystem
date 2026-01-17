package healthcare;

import java.sql.*;

public class PatientDAO {

    // INSERT
    public static void addPatient(String name, int age) {

        String sql = "INSERT INTO patient(name, age) VALUES (?, ?)";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.executeUpdate();

            System.out.println("Patient added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SELECT
    public static void showPatients() {

        String sql = "SELECT * FROM patient";

        try (
                Connection conn = DatabaseConnection.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("patient_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
