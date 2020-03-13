package model;


public class Masini {
    
    private int masinaId;
    private int versiuneMotorId;
    private String culoare;
    private String tapiterie;
    private String kilometraj;
    private String pret;
    private int capacitatePortbagaj;
    private int anFabricatie;

    private Masini() {
    }
        
    public static class Builder {
        private Masini masina = new Masini();
        
        public Builder setMasinaId(int masinaId) {
            masina.masinaId = masinaId;
            return this;
        }
        
        public Builder setVersiuneMotorId(int versiuneMotorId) {
            masina.versiuneMotorId = versiuneMotorId;
            return this;
        }
        
        public Builder setCuloare(String culoare) {
            masina.culoare = culoare;
            return this;
        }
        
        public Builder setTapiterie(String tapiterie) {
            masina.tapiterie = tapiterie;
            return this;
        }
        
        public Builder setKilometraj(String kilometraj) {
            masina.kilometraj = kilometraj;
            return this;
        }
        
        public Builder setPret(String pret) {
            masina.pret = pret;
            return this;
        }
        
        public Builder setCapacitatePortbagaj(int capacitatePortbagaj) {
            masina.capacitatePortbagaj = capacitatePortbagaj;
            return this;
        }
        
        public Builder setAnFabricatie(int anFabricatie) {
            masina.anFabricatie = anFabricatie;
            return this;
        }
        
        public Masini build() {
            return masina;
        }
    }

    public int getMasinaId() {
        return masinaId;
    }

    public int getVersiuneMotorId() {
        return versiuneMotorId;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public String getKilometraj() {
        return kilometraj;
    }

    public String getPret() {
        return pret;
    }

    public int getCapacitatePortbagaj() {
        return capacitatePortbagaj;
    }
    
    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setMasinaId(int masinaId) {
        this.masinaId = masinaId;
    }

    public void setVersiuneMotorId(int versiuneMotorId) {
        this.versiuneMotorId = versiuneMotorId;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public void setKilometraj(String kilometraj) {
        this.kilometraj = kilometraj;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public void setCapacitatePortbagaj(int capacitatePortbagaj) {
        this.capacitatePortbagaj = capacitatePortbagaj;
    } 
    
    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }    

    @Override
    public String toString() {
        return "Masini{" + "masinaId=" + masinaId + ", versiuneMotorId=" + versiuneMotorId + ", culoare=" + culoare + ", tapiterie=" + tapiterie + ", kilometraj=" + kilometraj + ", pret=" + pret + ", capacitatePortbagaj=" + capacitatePortbagaj + '}';
    }
    
    
    
}
