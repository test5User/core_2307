package lesson34._01_statement;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (var cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/po_2307", "root", "");
            var st = cn.createStatement()){
            var query = "INSERT INTO staff(name, age, department, project) VALUES ('employee11', 27, 5, 3)";
            st.execute(query);
        }
    }
}
