/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhirpbo;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author muhammad yusuf
 */
public class MySql {
    Connection konek = null;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection konek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");
            JOptionPane.showMessageDialog(null,"ConnectionEstablished");
            return konek;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    public static ObservableList<DataJne>getDataJne(){
        
        Connection konek = ConnectDb();
        ObservableList<DataJne> list = FXCollections.observableArrayList();
        try {
             PreparedStatement ps = konek.prepareStatement("select * from datajne");
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 list.add(new DataJne(rs.getString("noresi"),rs.getString("namapenerima"),rs.getString("nohp"),rs.getString("alamat"),rs.getString("jenisbarang")));
             }
        }catch (Exception e){
            
        }
        return list;
     
}
}