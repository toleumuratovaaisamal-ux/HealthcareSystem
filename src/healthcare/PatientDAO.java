package healthcare;

import java.sql.*;

public class PatientDAO {

    // INSERT
    public static void addPatient(String name, int age) {

        String sql = "INSERT INTO users(name, email, age) VALUES (?, ?, ?)";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, name);
            ps.setString(2, name.toLowerCase() + "@mail.com"); // auto email
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Patient added successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SELECT
    public static void showPatients() {

        String sql = "SELECT * FROM users";

        try (
                Connection conn = DatabaseConnection.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
