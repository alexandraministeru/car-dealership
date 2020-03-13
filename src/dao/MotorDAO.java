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
import model.Motor;


public class MotorDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private PreparedStatement stmt3;
    private PreparedStatement stmt4;
    private PreparedStatement stmt5;
    

    public MotorDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO motor(numemotor, tipcombustibil, tiptransmisie, numarpistoane, putere, numarvalve, numarviteze) VALUES (?,?,?,?,?,?,?)");
            stmt2 = con.prepareStatement("SELECT * FROM motor");
            stmt3 = con.prepareStatement("DELETE FROM motor WHERE motorid = ?");
            stmt4 = con.prepareStatement("UPDATE motor SET numemotor=?, tipcombustibil=?, tiptransmisie=?, numarpistoane=?, putere=?, numarvalve=?, numarviteze=? WHERE motorid=?");
            stmt5 = con.prepareStatement("SELECT * FROM motor WHERE numemotor=?");
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean create(Motor motor) {
        try {
            stmt1.setString(1, motor.getNumeMotor());
            stmt1.setString(2, motor.getTipCombustibil());
            stmt1.setString(3, motor.getTipTransmisie());
            stmt1.setInt(4, motor.getNumarPistoane());
            stmt1.setInt(5, motor.getPutere());
            stmt1.setInt(6, motor.getNumarValve());
            stmt1.setInt(7, motor.getNumarViteze());
            
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public List<Motor> findAll() {
        try (ResultSet rs = stmt2.executeQuery()) {
        
            List<Motor> listaMotor = new ArrayList<>();
            
            while(rs.next()) {
                Motor motor = new Motor.Builder()
                        .setMotorId(rs.getInt("MotorID"))
                        .setNumeMotor(rs.getString("NumeMotor"))
                        .setTipCombustibil(rs.getString("TipCombustibil"))
                        .setTipTransmisie(rs.getString("TipTransmisie"))
                        .setNumarPistoane(rs.getInt("NumarPistoane"))
                        .setPutere(rs.getInt("Putere"))
                        .setNumarValve(rs.getInt("NumarValve"))
                        .setNumarViteze(rs.getInt("NumarViteze"))
                        .build();
                        
                listaMotor.add(motor);
            }
            
            return listaMotor;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Collections.emptyList();
    }
    
    public boolean remove(int motorId) {
        try {
            stmt3.setInt(1, motorId);
            return stmt3.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean update(int motorId, String numeMotor, String tipCombustibil, String tipTransmisie, int numarPistoane,
            int putere, int numarValve, int numarViteze) {
        
        try {
            stmt4.setString(1, numeMotor);
            stmt4.setString(2, tipCombustibil);
            stmt4.setString(3, tipTransmisie);
            stmt4.setInt(4, numarPistoane);
            stmt4.setInt(5, putere);
            stmt4.setInt(6, numarValve);
            stmt4.setInt(7, numarViteze);
            stmt4.setInt(8, motorId);
            
            return stmt4.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public List<Motor> findMotorByNume(String numeMotor) {
        try {
            stmt5.setString(1, numeMotor);
            List<Motor> listaMotor = new ArrayList<>();            
            ResultSet rs = stmt5.executeQuery();
            
            while(rs.next()) {
                Motor motor = new Motor.Builder()
                        .setMotorId(rs.getInt("MotorID"))
                        .setNumeMotor(rs.getString("NumeMotor"))
                        .setTipCombustibil(rs.getString("TipCombustibil"))
                        .setTipTransmisie(rs.getString("TipTransmisie"))
                        .setNumarPistoane(rs.getInt("NumarPistoane"))
                        .setPutere(rs.getInt("Putere"))
                        .setNumarValve(rs.getInt("NumarValve"))
                        .setNumarViteze(rs.getInt("NumarViteze"))
                        .build();
                        
                listaMotor.add(motor);
            }
            
            return listaMotor;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Collections.emptyList();
    }
}
