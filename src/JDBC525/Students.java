package JDBC525;
import java.sql.*;
public class Students {
    public static void main(String[] args) {
        Connection con = null;
        Statement sql;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e) {
            System.out.println("加载失败");
        }
        try {//jdbc:mysql://localhost:3306/Students?useUnicode=true&characterEncoding=UTF-8
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root","123");
            System.out.println("\n**数据库连接成功**");
        }
        catch (SQLException e) {
            System.out.println("连接失败");
        }
        try {
            sql = con.createStatement();
            String news = "('181253','lihuogao',77),('181250','fuheng',79),('181265','wupeihua',55);";
            //sql.executeUpdate("insert into Stu values "+news);  //插入
            //sql.executeUpdate("delete from Stu where Sage<80"); //删除
            rs = sql.executeQuery("SELECT * FROM Stu WHERE Sage > 80");
            System.out.println("\n----成绩>80----");
            while(rs.next()) {
                String no = rs.getString(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                System.out.println("学号:"+no+" 姓名:"+name+" 成绩:"+age);
            }
            System.out.println("\n----全部数据----");
            rs = sql.executeQuery("SELECT * FROM Stu");
            while(rs.next()) {
                String no = rs.getString(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                System.out.println("学号:"+no+" 姓名:"+name+" 成绩:"+age);
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println("!!!");
        }
        System.out.println("\n操作结束！！");
    }
}

