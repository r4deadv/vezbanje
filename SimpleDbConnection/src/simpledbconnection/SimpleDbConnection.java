package simpledbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleDbConnection {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:mydatabase;create=true");
        if(conn.isClosed()){
            System.out.println("Connection to database failed");
            System.exit(0);
        }else{
            System.out.println("Connection to database successful");
        }
        //tabela je vec naravljena
        /*
        Statement st = conn.createStatement();
        String db_structure = "create table hiscores ("
        + "id int primary key "
        + "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
        + "name varchar(256),"
        + "score int"       
        + ")";
        st.execute(db_structure);
        */
        Statement st = conn.createStatement();
        Scanner s = new Scanner(System.in);
        while(true){
        System.out.println("Unesite ime:");
        String name = s.nextLine();
        System.out.println("Unesite score");
        int score =Integer.parseInt(s.nextLine());
        System.out.println("Unos zavrsen");
        try {
            st.execute("insert into hiscores (name,score) values ('"+name+"',"+score+")");
            System.out.println("Score successfully inserted");
        } catch (SQLException e) {
            System.out.println("Insert failed");
        }
        ResultSet rs = st.executeQuery("select * from hiscores");
        System.out.printf("%1$-7s%2$-15s%3$-7s\n","id","name","score");
        while(rs.next()){
            System.out.printf("%1$-7s%2$-15s%3$-7s\n",rs.getInt(1),rs.getString(2),rs.getInt(3));
        }
        }
        
    }
    
}
