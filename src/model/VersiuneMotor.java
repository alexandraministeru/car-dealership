package model;


public class VersiuneMotor {
    
    private int versiuneMotorId;
    private int versiuneId;
    private int motorId;
    private String tractiune;
    private String consum;    
    private String poluare;
    private String vitezaMaxima;

    private VersiuneMotor() {
    }    
        
    public static class Builder {
        private VersiuneMotor versiuneMotor = new VersiuneMotor();
        
        public Builder setVersiuneId(int versiuneId) {
            versiuneMotor.versiuneId = versiuneId;
            return this;
        }
        
        public Builder setMotorId(int motorId) {
            versiuneMotor.motorId = motorId;
            return this;
        }
        
        public Builder setVersiuneMotorId(int versiuneMotorId) {
            versiuneMotor.versiuneMotorId = versiuneMotorId;
            return this;
        }
        
        public Builder setTractiune(String tractiune) {
            versiuneMotor.tractiune = tractiune;
            return this;
        }
        
        public Builder setConsum(String consum) {
            versiuneMotor.consum = consum;
            return this;
        }
        
        public Builder setPoluare(String poluare) {
            versiuneMotor.poluare = poluare;
            return this;
        }
        
        public Builder setVitezamaxima(String vitezaMaxima) {
            versiuneMotor.vitezaMaxima = vitezaMaxima;
            return this;
        }
        
        public VersiuneMotor build() {
            return versiuneMotor;
        }
    }

    public int getVersiuneMotorId() {
        return versiuneMotorId;
    }

    public int getVersiuneId() {
        return versiuneId;
    }

    public int getMotorId() {
        return motorId;
    }

    public String getTractiune() {
        return tractiune;
    }

    public String getConsum() {
        return consum;
    }

    public String getPoluare() {
        return poluare;
    }

    public String getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVersiuneMotorId(int versiuneMotorId) {
        this.versiuneMotorId = versiuneMotorId;
    }

    public void setVersiuneId(int versiuneId) {
        this.versiuneId = versiuneId;
    }

    public void setMotorId(int motorId) {
        this.motorId = motorId;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public void setConsum(String consum) {
        this.consum = consum;
    }

    public void setPoluare(String poluare) {
        this.poluare = poluare;
    }

    public void setVitezaMaxima(String vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }   

    @Override
    public String toString() {
        return "VersiuneMotor{" + "versiuneMotorId=" + versiuneMotorId + ", versiuneId=" + versiuneId + ", motorId=" + motorId + ", tractiune=" + tractiune + ", consum=" + consum + ", poluare=" + poluare + ", vitezaMaxima=" + vitezaMaxima + '}';
    }   
    
}
