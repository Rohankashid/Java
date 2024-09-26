import java.sql.*;


public class jdbc {
    public static void main(String[] args) throws Exception{

        String url="jdbc:oracle://localhost:3307//Student11";
        String uname="rohan";
        String pass="";
        String query="select * from Student11";
        Class.forName("com.oracle.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

        rs.next();
        String name=rs.getString("username");
        System.out.println(name);

        st.close();
        rs.close();




        
    }
    
}
