package lesson20;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * 1.1 Создать модель пользователя в Java(User).
 * 1.2 Создать соответствующую модели таблицу в базе данных(users).
 * 1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
 * 1.4 Распарсить данные из ResultSet в объект User.
 * Задача 2:
 * Вытянуть из базы данных среднее значение возраста пользователей из таблицы users
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/c-24-onl-db", "root", "root");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE id=1");

        if (resultSet.next()) {
            User user = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
            System.out.println("id " + user.getId() + " name " + user.getName() + " age " + user.getAge());
        } else {
            System.out.println("Пользователь с id=1 не найден.");
        }

        ResultSet resultSe = statement.executeQuery("SELECT AVG(age) AS avg_age FROM user");

        if (resultSe.next()) {
            double averageAge = resultSe.getDouble("avg_age");
            System.out.println("Средний возраст пользователей: " + averageAge);
        } else {
            System.out.println("Не удалось получить средний возраст пользователей.");
        }
    }
}
