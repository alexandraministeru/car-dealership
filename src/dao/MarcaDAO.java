package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marca;


public class MarcaDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;
    private PreparedStatement stmt4;
    

    public MarcaDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO marca(numemarca) VALUES (?)");
            stmt2 = con.prepareStatement("SELECT * FROM marca ORDER BY numemarca");
            stmt3 = con.prepareStatement("DELETE FROM marca WHERE numemarca = ?");
            stmt4 = con.prepareStatement("SELECT * FROM marca WHERE numemarca=?");
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public boolean create(Marca marca) {
        try {            
            stmt1.setString(1, marca.getNumeMarca());                     
            return stmt1.executeUpdate() != 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
     
    public List<Marca> findAll() {
        try (ResultSet resultSet = stmt2.executeQuery()) {
            List<Marca> listaMarca = new ArrayList<>();
            
        while (resultSet.next()) {
            Marca marca = new Marca(
                resultSet.getInt("MarcaID"),
                resultSet.getString("NumeMarca")
            );
            
            listaMarca.add(marca);
        }           
            return listaMarca;
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
     
     public boolean remove (String numeMarca) {
        try {
            stmt3.setString(1, numeMarca);
            
            return stmt3.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
     } 
     
    public List<Marca> findByNumeMarca(String numeMarca) {
        try{
            stmt4.setString(1, numeMarca);
            List<Marca> listaMarca = new ArrayList<>();
            
            ResultSet resultSet = stmt4.executeQuery();
            
            while (resultSet.next()) {
                Marca marca = new Marca(
                    resultSet.getInt("MarcaID"),
                    resultSet.getString("NumeMarca")
                );

                listaMarca.add(marca);
        }           
            return listaMarca;
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
}
