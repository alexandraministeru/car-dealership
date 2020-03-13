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
import model.VersiuneMotor;


public class VersiuneMotorDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;

    public VersiuneMotorDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO versiunemotor(versiuneid, motorid, tractiune, consum, poluare, vitezamaxima) VALUES (?,?,?,?,?,?)");
            stmt2 = con.prepareStatement("SELECT * FROM versiunemotor");
            stmt3 = con.prepareStatement("SELECT * FROM versiunemotor WHERE versiuneid = ? AND motorid = ?");
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneMotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean create(VersiuneMotor versiuneMotor) {
        try {
            stmt1.setInt(1, versiuneMotor.getVersiuneId());
            stmt1.setInt(2, versiuneMotor.getMotorId());
            stmt1.setString(3, versiuneMotor.getTractiune());
            stmt1.setString(4, versiuneMotor.getConsum());
            stmt1.setString(5, versiuneMotor.getPoluare());
            stmt1.setString(6, versiuneMotor.getVitezaMaxima());
            
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneMotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public List<VersiuneMotor> findAll() {
        
        try(ResultSet rs = stmt2.executeQuery()) {
            List<VersiuneMotor> listaVersiuneMotor = new ArrayList<>();
            
            while(rs.next()) {
                VersiuneMotor versiuneMotor = new VersiuneMotor.Builder()
                        .setVersiuneMotorId(rs.getInt("VersiuneMotorID"))
                        .setVersiuneId(rs.getInt("VersiuneID"))
                        .setMotorId(rs.getInt("MotorID"))
                        .setTractiune(rs.getString("Tractiune"))
                        .setConsum(rs.getString("Consum"))
                        .setPoluare(rs.getString("Poluare"))
                        .setVitezamaxima(rs.getString("VitezaMaxima"))
                        .build();
                
            listaVersiuneMotor.add(versiuneMotor);
                                    
            }
            
            return listaVersiuneMotor;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneMotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
    public List<VersiuneMotor> findByMotorVersiuneId(int versiuneId, int motorId) {
        try {
            stmt3.setInt(1, versiuneId);
            stmt3.setInt(2, motorId);
            
             List<VersiuneMotor> listaVersiuneMotor = new ArrayList<>();
            
            ResultSet rs = stmt3.executeQuery();
            
            while(rs.next()) {
                VersiuneMotor versiuneMotor = new VersiuneMotor.Builder()
                        .setVersiuneMotorId(rs.getInt("VersiuneMotorID"))
                        .setVersiuneId(rs.getInt("VersiuneID"))
                        .setMotorId(rs.getInt("MotorID"))
                        .setTractiune(rs.getString("Tractiune"))
                        .setConsum(rs.getString("Consum"))
                        .setPoluare(rs.getString("Poluare"))
                        .setVitezamaxima(rs.getString("VitezaMaxima"))
                        .build();
                
            listaVersiuneMotor.add(versiuneMotor);
                                    
            }
            
            return listaVersiuneMotor;
        } catch (SQLException ex) {
            Logger.getLogger(VersiuneMotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();                
    }
    
}
