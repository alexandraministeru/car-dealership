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
import model.Versiune;


public class VersiuneDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;
    private PreparedStatement stmt4;
    private PreparedStatement stmt5;
    private PreparedStatement stmt6;
    
    public VersiuneDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO versiune(modelid, numeversiune, aninceputfabricatie,anfinalfabricatie) VALUES (?, ?, ?, ?)");
            stmt2 = con.prepareStatement("SELECT * FROM versiune WHERE modelid = ?");
            stmt3 = con.prepareStatement("DELETE FROM versiune WHERE numemodel = ?");
            stmt4 = con.prepareStatement("SELECT * FROM versiune");
            stmt5 = con.prepareStatement("UPDATE versiune SET numeversiune = ?, aninceputfabricatie = ?, anfinalfabricatie = ? WHERE versiuneid=?");
            stmt6 = con.prepareStatement("SELECT * FROM versiune WHERE modelid=? AND numeversiune=?");
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean create(Versiune versiune) {
        try {
            
            stmt1.setInt(1, versiune.getModelId());
            stmt1.setString(2, versiune.getNumeVersiune());
            stmt1.setString(3, versiune.getAnInceputFabricatie());
            stmt1.setString(4, versiune.getAnFinalFabricatie());
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public List<Versiune> findVersiuneByModelId(int modelId) {
        try{
            stmt2.setInt(1,modelId);
            ResultSet rs = stmt2.executeQuery();
            List<Versiune> listaVersiune = new ArrayList<>();
            
        while (rs.next()) {
            Versiune versiune = new Versiune.Builder()
                .setVersiuneId(rs.getInt("VersiuneID"))
                .setModelId(rs.getInt("ModelID"))
                .setNumeVersiune(rs.getString("NumeVersiune"))
                .setAnInceputFabricatie(rs.getString("AnInceputFabricatie"))
                .setAnFinalFabricatie(rs.getString("AnFinalFabricatie"))
                .build();            
            
            listaVersiune.add(versiune);
        }           
            return listaVersiune;
            
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
     
     public boolean remove (String numeVersiune) {
        try {
            stmt3.setString(1, numeVersiune);
            
            return stmt3.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
     } 
     
      public List<Versiune> findAll() {
        try (ResultSet rs = stmt4.executeQuery()) {
            List<Versiune> listaVersiune = new ArrayList<>();
            
                 
            while (rs.next()) {
                Versiune versiune = new Versiune.Builder()
                    .setVersiuneId(rs.getInt("VersiuneID"))
                    .setModelId(rs.getInt("ModelID"))
                    .setNumeVersiune(rs.getString("NumeVersiune"))
                    .setAnInceputFabricatie(rs.getString("AnInceputFabricatie"))
                    .setAnFinalFabricatie(rs.getString("AnFinalFabricatie"))
                    .build();            

                listaVersiune.add(versiune);
            }           
                return listaVersiune;
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
      
    public boolean update(int versiuneId, String numeVersiune, String anInceput, String anFinal) {
        try {
            stmt5.setString(1, numeVersiune);
            stmt5.setString(2, anInceput);
            stmt5.setString(3, anFinal);
            stmt5.setInt(4, versiuneId);
            
            return stmt5.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public List<Versiune> findVersiuneByModelIdNumeVersiune(int modelId, String numeVersiune) {
        try{
            stmt6.setInt(1,modelId);
            stmt6.setString(2, numeVersiune);
            ResultSet rs = stmt6.executeQuery();
            List<Versiune> listaVersiune = new ArrayList<>();
            
        while (rs.next()) {
            Versiune versiune = new Versiune.Builder()
                .setVersiuneId(rs.getInt("VersiuneID"))
                .setModelId(rs.getInt("ModelID"))
                .setNumeVersiune(rs.getString("NumeVersiune"))
                .setAnInceputFabricatie(rs.getString("AnInceputFabricatie"))
                .setAnFinalFabricatie(rs.getString("AnFinalFabricatie"))
                .build();            
            
            listaVersiune.add(versiune);
        }           
            return listaVersiune;
            
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
}
