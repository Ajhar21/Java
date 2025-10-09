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
    public static void main(String[] args) throws Exception{
        String url="jdbc:postgresql://localhost:5432/StudentDB";
        String uName="postgres";    //DB name
        String pass="DatAEngineeR24";   //postgres user password
//        Class.forName("org.postgresql.Driver"); //load & register driver, it's optional
        Connection conn= DriverManager.getConnection(url, uName, pass);
        System.out.println("Connection Established");
    }
}