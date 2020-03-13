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
import model.Masini;


public class MasiniDAO {
    
    private Connection con;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    

    public MasiniDAO(Connection con) {
        this.con = con;
        
        try {
            stmt1 = con.prepareStatement("INSERT INTO masini(versiunemotorid, culoare, tapiterie, kilometraj, pret, capacitateportbagaj, anfabricatie) VALUES (?,?,?,?,?,?,?)");
            stmt2 = con.prepareStatement("SELECT * FROM masini");
        } catch (SQLException ex) {
            Logger.getLogger(MasiniDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    
    public boolean create(Masini masina) {
        try {
            stmt1.setInt(1, masina.getVersiuneMotorId());
            stmt1.setString(2, masina.getCuloare());
            stmt1.setString(3, masina.getTapiterie());
            stmt1.setString(4, masina.getKilometraj());
            stmt1.setString(5, masina.getPret());
            stmt1.setInt(6, masina.getCapacitatePortbagaj());
            stmt1.setInt(7, masina.getAnFabricatie());
            
            return stmt1.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(MasiniDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;        
    }
    
    public List<Masini> findAll() {
        try (ResultSet rs = stmt2.executeQuery()) {
            
            List<Masini> listaMasini = new ArrayList<>();
            
            while(rs.next()) {
                Masini masina = new Masini.Builder()
                        .setMasinaId(rs.getInt("MasinaID"))
                        .setVersiuneMotorId(rs.getInt("VersiuneMotorID"))
                        .setCuloare(rs.getString("Culoare"))
                        .setTapiterie(rs.getString("Tapiterie"))
                        .setKilometraj(rs.getString("Kilometraj"))
                        .setPret(rs.getString("Pret"))
                        .setCapacitatePortbagaj(rs.getInt("CapacitatePortbagaj"))
                        .setAnFabricatie(rs.getInt("AnFabricatie"))
                        .build();

                listaMasini.add(masina);                    
            }
            
        return listaMasini;
        } catch (SQLException ex) {
            Logger.getLogger(MasiniDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Collections.emptyList();
    }
    
    
}
