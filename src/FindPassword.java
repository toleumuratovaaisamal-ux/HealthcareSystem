import java.sql.*;

public class FindPassword {

    public static void main(String[] args) {

        String[] passwords = {
                "",              // пустой
                "postgres",      // стандартный
                "root",          // популярный
                "12345",         // простой
                "password",      // самый частый
                "123456",        // простой числовой
                "admin",         // администраторский
                "qwerty"         // популярный
        };

        String url = "jdbc:postgresql://localhost:5432/healthcare_system";
        String user = "postgres";

        System.out.println("🔍 Поиск правильного пароля PostgreSQL...");

        for (String password : passwords) {
            try {
                System.out.print("Пробуем пароль: '" + password + "' ... ");
                Connection conn = DriverManager.getConnection(url, user, password);

                System.out.println("✅ УСПЕХ!");
                System.out.println("🎉 Правильный пароль: " + password);

                // Проверка базы
                System.out.println("📊 База данных: " + conn.getCatalog());

                conn.close();
                return;

            } catch (SQLException e) {
                System.out.println("❌ не подошел");
            }
        }

        System.out.println("\n😞 Ни один из стандартных паролей не подошел.");
        System.out.println("💡 Возможные решения:");
        System.out.println("   1. Откройте pgAdmin → правой кнопкой на сервере → Properties → Connection");
        System.out.println("   2. Сбросьте пароль");
        System.out.println("   3. Попробуйте пароль, который вы вводили при установке PostgreSQL");
    }
}
