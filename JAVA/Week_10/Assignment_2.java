import java.sql.*;
import java.lang.*;
import java.util.Scanner;
public class Question102 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
// Open a connection and check connection status
conn= DriverManager.getConnection(DB_URL);

if(conn.isClosed())
   System.out.print("false");
else
   System.out.print("true");
}
       catch(Exception e){ System.out.println(e);}  
    }
}
