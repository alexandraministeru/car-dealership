
package controller;

import dao.MarcaDAO;
import dao.MasiniDAO;
import dao.ModelDAO;
import dao.MotorDAO;
import dao.VersiuneDAO;
import dao.VersiuneMotorDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marca;
import model.Masini;
import model.Model;
import model.Motor;
import model.Versiune;
import model.VersiuneMotor;


public class MainController {
    
    private MarcaDAO marcaDao;
    private ModelDAO modelDao;
    private VersiuneDAO versiuneDao;
    private MotorDAO motorDao;
    private VersiuneMotorDAO versiuneMotorDao;
    private MasiniDAO masiniDao;
    
    
       
    private MainController() {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "jdbc:sqlserver://DPHT-80I669Q\\SQLEXPRESS:1433;databaseName=DealerAuto";
        
        try {
            Connection con = DriverManager.getConnection(url, "ali", "parolaSQL");
            marcaDao = new MarcaDAO(con);
            modelDao = new ModelDAO(con);
            versiuneDao = new VersiuneDAO(con);
            motorDao = new MotorDAO(con);
            versiuneMotorDao = new VersiuneMotorDAO(con);
            masiniDao = new MasiniDAO(con);
            
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MainController getInstance() {
        return MainControllerHolder.INSTANCE;
    }
    
    private static class MainControllerHolder {

        private static final MainController INSTANCE = new MainController();
    }
    
    public boolean adaugaMarca(Marca m) {
        return marcaDao.create(m);
    }
    
    public List<Marca> getMarca() {
        return marcaDao.findAll();
    }
    
    public List<Marca> getMarcaByNumeMarca(String numeMarca) {
        return marcaDao.findByNumeMarca(numeMarca);
    }
    
    public List<Model> getModel(int marcaId) {
        return modelDao.findByMarcaId(marcaId);
    }
    
    public List<Model> getModel() {
        return modelDao.findAll();
    }
    
    public boolean adaugaModel(Model m) {
        return modelDao.create(m);
    }
    
    public List<Model> getModelByNumeModel(String numeModel) {
        return modelDao.findByNumeModel(numeModel);
    }
    
    public List<Motor> getMotor() {
        return motorDao.findAll();
    }
    
    public boolean adaugaMotor(Motor m) {
        return motorDao.create(m);
    }
    
    public List<Motor> getMotorByNume(String numeMotor) {
        return motorDao.findMotorByNume(numeMotor);
    }    
    
    public List<Versiune> getVersiune(int modelId) {
        return versiuneDao.findVersiuneByModelId(modelId);
    }
    
    public List<Versiune> getVersiuneByModelNume(int modelId, String numeVersiune) {
        return versiuneDao.findVersiuneByModelIdNumeVersiune(modelId, numeVersiune);
    }
    
    public boolean adaugaVersiune(Versiune v) {
        return versiuneDao.create(v);
    }
       
    public boolean adaugaVersiuneMotor(VersiuneMotor vm) {
        return versiuneMotorDao.create(vm);
    }
    
    public boolean adaugaMasina(Masini m) {
        return masiniDao.create(m);
    }
    
    public List<VersiuneMotor> getVersiuneMotorByVersiuneMotorId(int versiuneId, int motorId) {
        return versiuneMotorDao.findByMotorVersiuneId(versiuneId, motorId);
    }
    
    public List<Versiune> getVersiune() {
        return versiuneDao.findAll();
    }
    
    public boolean updateVersiune(int versiuneId, String numeVersiune, String anInceputFabricatie, String anFinalFabricatie) {
        return versiuneDao.update(versiuneId, numeVersiune, anInceputFabricatie, anFinalFabricatie);
    }
    
    public boolean updateMotor(int motorId, String numeMotor, String tipCombustibil, String tipTransmisie, int numarPistoane,
            int putere, int numarValve, int numarViteze) {
        return motorDao.update(motorId, numeMotor, tipCombustibil, tipTransmisie, numarPistoane, putere, numarValve, numarViteze);
    }
    
    public boolean removeMarcaByNume(String numeMarca) {
        return marcaDao.remove(numeMarca);
    }
    
    public boolean removeMotorByMotorId(int motorId) {
        return motorDao.remove(motorId);
    }
}
