/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway;
import java.sql.*;

/**
 *
 * @author admin
 */
public class Railway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "root";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", user, pass);

            // 2. Create a statement
            myStmt = myConn.createStatement();

            System.out.println("Done");
            myRs = myStmt.executeQuery("select * from person");
            while (myRs.next()) {
                System.out.println(myRs.getString("firstname") + ", " + myRs.getString("lastname"));
            }
            Main m=new Main();
            m.setVisible(true);
//            Register s = new Register();
//            s.setVisible(true);
        }catch (Exception exc) {
           System.out.println(exc);
        } 
            
    }    
    
}
