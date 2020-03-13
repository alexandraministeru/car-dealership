package model;


public class Motor {
    
    private int motorId;
    private String numeMotor;
    private String tipCombustibil;
    private String tipTransmisie;
    private int numarPistoane;
    private int putere;
    private int numarValve;
    private int numarViteze;

    private Motor() {
    }
            
    public static class Builder {
        private Motor motor = new Motor();
        
        public Builder setMotorId(int motorId) {
            motor.motorId = motorId;
            return this;
        }
        
        public Builder setNumeMotor(String numeMotor) {
            motor.numeMotor = numeMotor;
            return this;
        }
        
        public Builder setTipCombustibil(String tipCombustibil) {
            motor.tipCombustibil = tipCombustibil;
            return this;
        }
        
        public Builder setTipTransmisie(String tipTransmisie) {
            motor.tipTransmisie = tipTransmisie;
            return this;
        }
        
        public Builder setNumarPistoane(int numarPistoane) {
            motor.numarPistoane = numarPistoane;
            return this;
        }
        
        public Builder setPutere(int putere) {
            motor.putere = putere;
            return this;
        }
        
        public Builder setNumarValve(int numarValve) {
            motor.numarValve = numarValve;
            return this;
        }
        
        public Builder setNumarViteze(int numarViteze) {
            motor.numarViteze = numarViteze;
            return this;
        }
         
        public Motor build() {
            return motor;
        }       
        
    }

    public int getMotorId() {
        return motorId;
    }

    public String getNumeMotor() {
        return numeMotor;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public String getTipTransmisie() {
        return tipTransmisie;
    }

    public int getNumarPistoane() {
        return numarPistoane;
    }

    public int getPutere() {
        return putere;
    }

    public int getNumarValve() {
        return numarValve;
    }

    public int getNumarViteze() {
        return numarViteze;
    }

    public void setMotorId(int motorId) {
        this.motorId = motorId;
    }

    public void setNumeMotor(String numeMotor) {
        this.numeMotor = numeMotor;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }

    public void setTipTransmisie(String tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }

    public void setNumarPistoane(int numarPistoane) {
        this.numarPistoane = numarPistoane;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public void setNumarValve(int numarValve) {
        this.numarValve = numarValve;
    }

    public void setNumarViteze(int numarViteze) {
        this.numarViteze = numarViteze;
    }   

    @Override
    public String toString() {
        return numeMotor;
    }    
    
}
