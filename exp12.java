import java.lang.Thread.State;
import java.sql.*;

public class exp12 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521");

        Statement stmt = con.createStatement();

        System.out.println("COnnection is done!");
        stmt.execute("create table Stud(Roll_no int Primary key,Name varchar(20),Division varchar(20))");

        String query = "insert into Stud values(226,'rohan','C')";

        String query1 = "select * from Stud";

        ResultSet rs = stmt.executeQuery(query1);
        System.out.println("######### Student Data ##########");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }
        System.out.println();
        con.close();
    }

}
