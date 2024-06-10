package lesson34._02_execute_query;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.util.ArrayList;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (var cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/po_2307", "root", "");
             var st = cn.createStatement()){
            var query = "SELECT s.name, s.age, d.name department FROM staff s INNER JOIN department d ON s.department = d.id";
            var staff = new ArrayList<Staff>();
            var rs = st.executeQuery(query);
            while (rs.next()) {
                var name = rs.getString(1);
                var age = rs.getInt("age");
                var department = rs.getString(3);
                staff.add(new Staff(name, age, department));
            }
            staff.forEach(System.out::println);
        }
    }
}
