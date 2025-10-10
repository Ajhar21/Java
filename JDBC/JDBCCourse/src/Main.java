/*********** steps for JDBC *****************
 * import packages
 * load & register driver
 * create connection
 * create statement
 * execute statements
 * process the results
 * close
 * */
import java.sql.*;
public class Main{
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/StudentDB";
        String uName="postgres";    //DB name
        String pass="DatAEngineeR2";   //postgres user password
//        Class.forName("org.postgresql.Driver"); //load & register driver, it's optional
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(url, uName, pass);
            System.out.println("Connection Established");
        }
        catch (SQLException e){
            System.out.println("Failed Connection"+e);
        }
        finally {
            try {
                conn.close();
            }
            catch (SQLException e){
                System.out.println("Connection failed to close"+e);
            }
            catch (NullPointerException n){
                System.out.println("connection wasn't there"+n);

            }
        }
    }
}