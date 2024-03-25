import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crudoperations {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:postgresql://localhost:5432/ankit";
        String uname="postgres";
        String pass="0000";
        String sqlinsert="insert into student values (6,'kamal',98)";
        String sqlupdate="update student set name='pizza' where id =4";
        String sqldelete="delete from student where id=4";
        //preparedStatement
        String sql="insert into student values (?,?,?)";
        //   Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st=con.createStatement();
        //st.execute(sqlinsert);
       //st.execute(sqlupdate);
      st.execute(sqldelete);

        con.close();
        System.out.println("connection closed");

    }
}
