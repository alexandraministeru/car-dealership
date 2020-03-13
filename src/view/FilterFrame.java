package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilterFrame extends javax.swing.JFrame {

   
    public FilterFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Selectati filtrul:"));

        jButton1.setText("Afisati toate masinile disponibile");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Afisati masini noi");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Afisati masini de culoare:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negru", "Alb", "Gri", "Rosu", "Galben", "Albastru" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox1MouseExited(evt);
            }
        });

        jButton3.setText("Afisati masini second-hand");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Masini cu pret mai mic decat media preturilor");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Masini cu putere mai mare decat media puterilor masinilor fabricate in acelasi an");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Masini cu cutie automata de viteze");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Masini cu cutie manuala de viteze");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel2.setText("Afisati versiuni de masini fabricate dupa anul:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2005", "2015", "2016", "2017", "2018" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });

        jButton8.setText("Motorul cu cea mai mare putere");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("< Inapoi");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Masini cu benzina care au consumul mai mic decat orice masina cu motorina");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton5)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9)
                        .addGap(160, 160, 160)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID;";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            
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

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query2 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, \n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Masini.Kilometraj = 0";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query2);
            
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
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseExited

    }//GEN-LAST:event_jComboBox1MouseExited

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        jTextArea1.setText(null);
        String culoareS = jComboBox1.getSelectedItem().toString();
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query4 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, \n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Masini.Culoare = ?";
            
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
            
            PreparedStatement stmt = con.prepareStatement(query4);
            stmt.setString(1,culoareS);
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
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query3 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, \n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Masini.Kilometraj > 0";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query3);
            
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
                
                jTextArea1.append(marca + "\t" + model + "\t" + versiune + "\t" + motor + "\t" + culoare + "\t" + tapiterie + "\t" + kilometraj + "\t" + capacitatePortbagaj + "\t"  + anFabricatie + "\t" + pret + "\n");
                
            }                 

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query5 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, \n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Masini.Pret < (SELECT AVG(Pret) FROM Masini)";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query5);
            
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
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
                jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query6 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune,\n" +
                            "Motor.NumeMotor, Motor.Putere, M.Culoare, M.Tapiterie, M.Kilometraj,\n" +
                            "M.CapacitatePortbagaj, M.AnFabricatie, M.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini M ON M.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Motor.Putere >= (\n" +
                            "SELECT AVG(Putere)\n" +
                            "FROM Motor INNER JOIN VersiuneMotor\n" +
                            "ON Motor.MotorID = VersiuneMotor.MotorID\n" +
                            "INNER JOIN Masini\n" +
                            "ON VersiuneMotor.VersiuneMotorID = Masini.VersiuneMotorID\n" +
                            "WHERE Masini.AnFabricatie = M.AnFabricatie);";
            
            String marca;
            String model;
            String versiune;            
            String motor;
            int putere;
            String culoare;
            String tapiterie;
            String kilometraj;
            int capacitatePortbagaj;      
            int anFabricatie;
            String pret;
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query6);
            
            while(rs.next()) {
                marca = rs.getString("NumeMarca");
                model = rs.getString("NumeModel");
                versiune = rs.getString("NumeVersiune");                
                motor = rs.getString("NumeMotor");
                putere = rs.getInt("Putere");
                culoare = rs.getString("Culoare");
                tapiterie = rs.getString("Tapiterie");
                kilometraj = rs.getString("Kilometraj");
                capacitatePortbagaj = rs.getInt("CapacitatePortbagaj");
                anFabricatie = rs.getInt("AnFabricatie");
                pret = rs.getString("Pret");
                
                jTextArea1.append(marca + "\t" + model + "\t" + versiune + "\t" + motor + "\t" + putere + "\t" + culoare + "\t" + tapiterie + "\t" + kilometraj + "\t" + capacitatePortbagaj + "\t" + anFabricatie + "\t" + pret + "\n");
                
            }                 

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query7 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune,\n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Motor.TipTransmisie = 'Automata'";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query7);
            
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
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query8 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune,\n" +
                            "Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, \n" +
                            "Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Motor.TipTransmisie = 'Manuala'";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query8);
            
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
                
                jTextArea1.append(marca + "\t" + model + "\t" + versiune + "\t" + motor + "\t" + culoare + "\t" + tapiterie + "\t" + kilometraj + "\t" + capacitatePortbagaj + "\t" + anFabricatie + "\t" + pret+ "\n");
                
            }                 

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        jTextArea1.setText(null);
        String anF = jComboBox2.getSelectedItem().toString();
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query9 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, Versiune.AnInceputFabricatie\n" +
                            "FROM Versiune INNER JOIN Model\n" +
                            "ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Model.MarcaID = Marca.MarcaID\n" +
                            "WHERE Versiune.AnInceputFabricatie >= ?";
            
            String marca;
            String model;
            String versiune;
            String anInceputFabricatie;
            
            PreparedStatement stmt = con.prepareStatement(query9);
            stmt.setString(1, anF);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                marca = rs.getString("NumeMarca");
                model = rs.getString("NumeModel");
                versiune = rs.getString("NumeVersiune");
                anInceputFabricatie = rs.getString("AnInceputFabricatie");
                
                jTextArea1.append(marca + "\t" + model + "\t" + versiune + "\t" + anInceputFabricatie + "\n");                
            }      
            

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query10 = "SELECT M.NumeMotor,  M.TipCombustibil, M.TipTransmisie, \n" +
                             "M.NumarPistoane, M.Putere, M.NumarValve, M.NumarViteze \n" +
                             "FROM Motor M WHERE Putere >= ALL(SELECT Putere FROM Motor)";
            
            String numeMotor;
            String combustibil;
            String transmisie;
            int numarPistoane;
            int putere;
            int numarValve;
            int numarViteze;

            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query10);
            
            while(rs.next()) {
                numeMotor = rs.getString("NumeMotor");
                combustibil = rs.getString("TipCombustibil");
                transmisie = rs.getString("TipTransmisie");
                numarPistoane = rs.getInt("NumarPistoane");
                putere = rs.getInt("Putere");
                numarValve = rs.getInt("NumarValve");
                numarViteze = rs.getInt("NumarViteze");
                
                
                jTextArea1.append(numeMotor + "\t" + combustibil + "\t" + transmisie + "\t" + numarPistoane + "\t" + putere + "\t" + numarValve + "\t" + numarViteze + "\n");
                
            }                 

        } catch (SQLException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        setVisible(false);
        new HomeFrame().setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        jTextArea1.setText(null);
               
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            String query11 = "SELECT Marca.NumeMarca, Model.NumeModel, Versiune.NumeVersiune, Motor.NumeMotor, Masini.Culoare, Masini.Tapiterie, Masini.Kilometraj, Masini.CapacitatePortbagaj, Masini.AnFabricatie, Masini.Pret\n" +
                            "FROM VersiuneMotor INNER JOIN Masini ON Masini.VersiuneMotorID = VersiuneMotor.VersiuneMotorID\n" +
                            "INNER JOIN Motor ON VersiuneMotor.MotorID = Motor.MotorID\n" +
                            "INNER JOIN Versiune ON VersiuneMotor.VersiuneID = Versiune.VersiuneID\n" +
                            "INNER JOIN Model ON Versiune.ModelID = Model.ModelID\n" +
                            "INNER JOIN Marca ON Marca.MarcaID = Model.MarcaID\n" +
                            "WHERE Motor.TipCombustibil = 'Benzina' AND VersiuneMotor.Consum <= ALL \n" +
                            "(SELECT VersiuneMotor.Consum\n" +
                            " FROM Motor INNER JOIN VersiuneMotor ON Motor.MotorID = VersiuneMotor.MotorID\n" +
                            " WHERE Motor.TipCombustibil = 'Motorina')";
            
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
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query11);
            
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
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
