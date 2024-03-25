import java.util.*;
import java.sql.*;
class Main{

    /*
    *
    * */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:postgresql://localhost:5432/ankit";
        String uname="postgres";
        String pass="0000";
        String sql="select * from student";
     //   Class.forName("org.postgresql.Driver");
        Connection con =DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
//        System.out.println("Connection has data"+rs.next());
//       String namer= rs.getString("name");
//        System.out.println("Name of Student is:"+namer);
        while (rs.next()){
            System.out.print(" id "+"-"+rs.getInt(1));
            System.out.print(" name "+"-"+rs.getString(2));
            System.out.println(" marks "+rs.getInt(3));
          //  System.out.print();


        }
        con.close();
        System.out.println("connection close");

    }
}