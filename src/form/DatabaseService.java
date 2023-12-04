package form;

import static form.DatabaseService.con;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatabaseService {
    static final String COM_MYSQL_CJ_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/kasir";
    static final String USER = "root";
    static final String PASSWORD = "";
    static Connection con;
    static Statement st;
    static ResultSet rs;
    static Connection List;

    public static List<Barang> getAllItems() {
        List<Barang> items = new ArrayList<Barang>();
        try {
            Class.forName(COM_MYSQL_CJ_JDBC_DRIVER);
            String url = URL;
            String user = USER;
            String password = PASSWORD;

            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            String query = "SELECT * FROM daftar_barang";
            rs = st.executeQuery(query);

            // tampilkan hasil query
            while (rs.next()) {
                Barang item = new Barang(
                        rs.getString("Kode_Barang"),
                        rs.getString("Merk"),
                        rs.getString("Nama"),
                        rs.getString("Jenis"),
                        rs.getInt("Harga"),
                        rs.getInt("Stock")
                );
                System.out.println(item);
                items.add(item);
            }

            st.close();
            con.close();
        } catch (Exception e) {
            System.err.println("koneksi gagal");
        }
        return items;
    }

    public static Barang findById(String kode) {
        try {
            Barang item = new Barang();
            Class.forName(COM_MYSQL_CJ_JDBC_DRIVER);
            String url = URL;
            String user = USER;
            String password = PASSWORD;

            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            String query = "SELECT * FROM daftar_barang WHERE Kode_Barang = '" + kode + "'";
            rs = st.executeQuery(query);
            if(rs.next()) {
                item = new Barang(
                        rs.getString("Kode_Barang"),
                        rs.getString("Merk"),
                        rs.getString("Nama"),
                        rs.getString("Jenis"),
                        rs.getInt("Harga"),
                        rs.getInt("Stock")
                );
            }
            st.close();
            con.close();
            return item;
        } catch (Exception e) {
            return null;
        }
    }

   
    static com.sun.jdi.connect.spi.Connection con() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
public Connection getCon(){
        return con;
}

    void koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
