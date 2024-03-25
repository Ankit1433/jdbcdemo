import java.sql.*;

public class preparedStatement {
    public static void main(String[] args) throws SQLException {
        int id=7;
        String name="raju";
        int marks=1;
        String url="jdbc:postgresql://localhost:5432/ankit";
        String uname="postgres";
        String pass="0000";
        String sql="insert into student values (?,?,?)";
        //   Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,marks);
        st.execute();
        System.out.println("connection closed");
        con.close();
    }
}
