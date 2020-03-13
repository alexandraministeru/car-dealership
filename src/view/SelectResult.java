package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SelectResult extends javax.swing.JFrame {

    private int versiuneId;
    private int motorId;
    
    public SelectResult(int versiuneId, int motorId) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.versiuneId = versiuneId;
        this.motorId = motorId;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Afisare");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jButton1)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                
        jTextArea1.setText(null);      
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query1 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, \n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj,Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.ModelID WHERE VersiuneMotor.VersiuneID = ? AND VersiuneMotor.MotorID = ?";
            
            String marca;
            String model;
            String versiune;
            String motor;
            String culoare;
            String tapiterie;
            String kilometraj;
            int capacitatePortbagaj;
            int anFabricatie;
            String pret;
            
            PreparedStatement stmt = con.prepareStatement(query1);
            stmt.setInt(1,versiuneId);
            stmt.setInt(2, motorId);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                marca = rs.getString("NumeMarca");
                model = rs.getString("NumeModel");
                versiune = rs.getString("NumeVersiune");
                motor = rs.getString("NumeMotor");
                culoare = rs.getString("Culoare");
                tapiterie = rs.getString("Tapiterie");
                kilometraj = rs.getString("Kilometraj");
                capacitatePortbagaj = rs.getInt("CapacitatePortbagaj");
                anFabricatie = rs.getInt("AnFabricatie");
                pret = rs.getString("Pret");
                
                jTextArea1.append(marca + "\t" + model + "\t" + versiune + "\t" + motor + "\t" + culoare + "\t" + tapiterie + "\t" + kilometraj + "\t" + capacitatePortbagaj + "\t" + anFabricatie + "\t" + pret + "\n");
                
            }  
            

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
