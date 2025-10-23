
/******************* PreparedStatement ********************
 * PreparedStatement is an interface which extends Statement
 * for unknown values in query, it's always better than Statement
 *
 * it prevents SQL injection, improve performance
 *
 * */
import java.sql.*;
public class PrepStatement{
    public static void main(String[] args)  {
        String url="jdbc:postgresql://localhost:5432/StudentDB";
        String uName="postgres";    //DB name
        String pass="DatAEngineeR24";   //postgres user password
//        Class.forName("org.postgresql.Driver"); //load & register driver, it's optional
        Connection conn=null;
        PreparedStatement ps= null;

        /*130: Taking input*/
        int id=103;
        String name="Saania";
        int marks=90;
        String sql_prepared="insert into student values(?,?,?)";    //every question mark needs to be replaced by variable

        try {
            conn = DriverManager.getConnection(url, uName, pass);   //create connection
            System.out.println("Connection Established");

            ps=conn.prepareStatement(sql_prepared);
            ps.setInt(1,id);    //column index, variable name
            ps.setString(2,name);
            ps.setInt(3,marks);

            ps.execute();
        }
        catch (SQLException e) {
//            e.printStackTrace();
            System.out.println("Connection Failed "+ e);
        }
        finally {
            try {
                conn.close();
                System.out.println("Connection closed");
            }
            catch (NullPointerException n){
                System.out.println("Connection wasn't established "+n);
            }
            catch (SQLException e) {
//            e.printStackTrace();
                System.out.println("Connection Failed close "+ e);
            }
        }

    }
}