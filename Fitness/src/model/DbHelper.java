package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbHelper {
    Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/fitness", "root", "");
    }
    
    public Rezultat get(int id) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareCall("select * from rezultati where id = ?");
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            return new Rezultat(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
        }
        return null;
    }
    
    public List get() throws SQLException{
        return get("");
    }
    
    public List get(String filter) throws SQLException{
        ArrayList res = new ArrayList();
        Connection conn = connect();
        PreparedStatement st = conn.prepareCall("select * from rezultati "+filter);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            res.add(new Rezultat(
                    rs.getInt("id"), 
                    rs.getString("ime"), 
                    rs.getDouble("km"),
                    rs.getInt("vreme")
            ));
        }
        conn.close();
        return res;
    }
    
    public boolean delete(int id) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("delete from rezultati where id = ?");
        st.setInt(1, id);
        st.execute();
        boolean res = st.getUpdateCount()>0;
        conn.close();
        return res;
    }
    
    public boolean update(Rezultat r) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("update rezultati set ime=?, km=?, vreme=? where id = ?");
        st.setString(1, r.ime);
        st.setDouble(2, r.km);
        st.setInt(3, r.vreme);
        st.setInt(4, r.id);
        st.execute();
        boolean res = st.getUpdateCount()>0;
        conn.close();
        return res;
    }
    
    public boolean add(Rezultat r) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("insert into rezultati values(null,?,?,?)");
        st.setString(1, r.ime);
        st.setDouble(2, r.km);
        st.setInt(3, r.vreme);
        st.execute();
        boolean res = st.getUpdateCount()>0;
        conn.close();
        return res;
    }
    
    public boolean login(String username, String pass) throws SQLException{
        Connection conn = connect();
        PreparedStatement st = conn.prepareStatement("select * from users where ime = ? and sifra = sha1(unhex(sha1(?)))");
        st.setString(1, username);
        st.setString(2, pass);
        ResultSet rs = st.executeQuery();
        return rs.next();
    }
}
