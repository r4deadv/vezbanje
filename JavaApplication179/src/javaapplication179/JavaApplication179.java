package javaapplication179;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

public class JavaApplication179 {
    public static void main(String[] args) throws SQLException {
//        Enumeration<Driver> drajveri = DriverManager.getDrivers();
//        while(drajveri.hasMoreElements()){
//            System.out.println(drajveri.nextElement());
//        }
        Connection conn = DriverManager.getConnection("jdbc:derby:sminka;create=true");
        //System.out.println(conn);
        //System.out.println(conn.isClosed());
        Statement st = conn.createStatement();
        
//        st.execute("insert into karmini (id,naziv,boja) values(6,'Max Factor 69','Blue'),(7,'Lancome aaa','Red')");
        ResultSet rs = st.executeQuery("select * from karmini");
//        rs.next();
//        System.out.println("Id karmina je " + rs.getInt(1) + " Naziv karmina je " + rs.getString("naziv"));
//        rs.next();
//        System.out.println("Id karmina je " + rs.getInt(1) + " Naziv karmina je " + rs.getString(2));
        System.out.printf("%1$-5s%2$-20s%3$-15s\n","id","naziv","boja");
        while(rs.next()){
            System.out.printf("%1$-5s%2$-20s%3$-15s\n",rs.getInt(1),rs.getString(2),rs.getString(3));
        }
        conn.close();
    }
}
