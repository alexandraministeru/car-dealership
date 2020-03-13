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
import model.Model;


public class ModelDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;
    private PreparedStatement stmt4;
    private PreparedStatement stmt5;
    
    public ModelDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement
                    ("INSERT INTO model(marcaid, numemodel) VALUES(?, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM model WHERE marcaId = ?");
            stmt3 = con.prepareStatement("DELETE FROM model WHERE numemodel = ?");
            stmt4 = con.prepareStatement("SELECT * FROM model");
            stmt5 = con.prepareStatement("SELECT * FROM model WHERE numemodel=?");
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public boolean create(Model model) {
        try {
            stmt1.setInt(1, model.getMarcaId());
            stmt1.setString(2, model.getNumeModel());
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
       
    public List<Model> findByMarcaId(int marcaId) {
        
        try {
            stmt2.setInt(1, marcaId);
            ResultSet rs = stmt2.executeQuery();
            
            List<Model> listaModel = new ArrayList<>();
            
            
            while(rs.next()) {
                Model model = new Model(
                    rs.getInt("ModelID"),
                    rs.getInt("MarcaID"),
                    rs.getString("NumeModel")
                );
                
            listaModel.add(model);
            }        
        return listaModel;
        
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
    public boolean remove (String numeModel) {
        try {
            stmt3.setString(1, numeModel);
            return stmt3.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
     public List<Model> findAll() {
        try (ResultSet resultSet = stmt4.executeQuery()) {
            List<Model> listaModel = new ArrayList<>();
            
        while (resultSet.next()) {
            Model model = new Model(
                    resultSet.getInt("ModelID"),
                    resultSet.getInt("MarcaID"),
                    resultSet.getString("NumeModel")
                );
            
            listaModel.add(model);
        }           
            return listaModel;
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
     
    public List<Model> findByNumeModel(String numeModel) {
        
        try {
            stmt5.setString(1, numeModel);
            ResultSet rs = stmt5.executeQuery();
            
            List<Model> listaModel = new ArrayList<>();
            
            
            while(rs.next()) {
                Model model = new Model(
                    rs.getInt("ModelID"),
                    rs.getInt("MarcaID"),
                    rs.getString("NumeModel")
                );
                
            listaModel.add(model);
            }        
        return listaModel;
        
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
}
