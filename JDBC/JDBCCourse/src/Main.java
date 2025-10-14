/*********** steps for JDBC *****************
 * import packages
 * load & register driver
 * create connection
 * create statement
 * execute statements
 * process the results
 * close
 * */

/*rs.next() shift the pointer to next row. but pointer always point before a row*/

/*executeQuery() for select, execute() for update,delete,create*/

/********************** Problem with Statement *****************
 * 1. it is difficult to write query string when taking data from user
 * 2. It can be vulnerable for SQL Injection
 * 3. Performance issue, can't have caching queries. Always calling DB for every query
 * ******************************************************************/


import java.sql.*;
public class Main{
    public static void main(String[] args)  {
        String url="jdbc:postgresql://localhost:5432/StudentDB";
        String uName="postgres";    //DB name
        String pass="DatAEngineeR24";   //postgres user password
//        Class.forName("org.postgresql.Driver"); //load & register driver, it's optional
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        String sql="select sname from student where sid=1";
        String sql1="select * from student";
        String insert="insert into student values(5,'Jhon',46)";    //create
        String update="update student set sname='Max' where sid=5";    //update
        String delete="delete from student where sid=5";    //delete
        String name=null;

        /*129: Problem with Statement*/
        int sid=101;
        String sname="Max";
        int marks=57;
        String sql_input= "insert into student values(" + sid + ", '" + sname + "', " + marks + ")"; //difficult to write

        try {
            conn = DriverManager.getConnection(url, uName, pass);   //create connection
            System.out.println("Connection Established");
            st=conn.createStatement();  //create statement
            rs=st.executeQuery(sql);    //execute statement, executeQuery() for fetching data
//            System.out.println(rs.next());
            rs.next();  //must execute rs.next(),because pointer always stay before row
            name=rs.getString("sname");
            System.out.println("Student name is: "+name);

            rs=st.executeQuery(sql1);

            System.out.println("Student details list: ");
            while(rs.next()){   //rs.next() return true or false, if any next row exist return true
                System.out.print(rs.getInt(1)+" "); //columnIndex is column serial, like sid serial 1
                System.out.print(rs.getString(2)+" ");
                System.out.println(rs.getInt(3));
            }

//            boolean status= st.execute(insert); //return true when select, but others return false
//            System.out.println(status);

//            boolean status_update= st.execute(update); //return true when select, but others return false
//            System.out.println(status_update);

//            st.execute(delete); //this also fine, not storing the result


            st.execute(sql_input);



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