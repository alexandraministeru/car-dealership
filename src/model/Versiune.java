package model;


public class Versiune {
    
    private int versiuneId;
    private int modelId;
    private String numeVersiune;
    private String anInceputFabricatie;
    private String anFinalFabricatie;

    private Versiune() {
    }   
    
    public static class Builder {
        private Versiune versiune = new Versiune();
        
        public Builder setVersiuneId(int versiuneId) {
            versiune.versiuneId = versiuneId;
            return this;
        }
        
        public Builder setModelId(int modelId) {
            versiune.modelId = modelId;
            return this;
        }
        
        public Builder setNumeVersiune(String numeVersiune) {
            versiune.numeVersiune = numeVersiune;
            return this;
        }
        
        public Builder setAnInceputFabricatie (String anInceputFabricatie) {
            versiune.anInceputFabricatie = anInceputFabricatie;
            return this;
        }
        
        public Builder setAnFinalFabricatie(String anFinalFabricatie) {
            versiune.anFinalFabricatie = anFinalFabricatie;
            return this;
        }
        
        public Versiune build() {
            return versiune;
        }
    }

    public int getVersiuneId() {
        return versiuneId;
    }

    public int getModelId() {
        return modelId;
    }

    public String getNumeVersiune() {
        return numeVersiune;
    }

    public String getAnInceputFabricatie() {
        return anInceputFabricatie;
    }

    public String getAnFinalFabricatie() {
        return anFinalFabricatie;
    }

    public void setVersiuneId(int versiuneId) {
        this.versiuneId = versiuneId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public void setNumeVersiune(String numeVersiune) {
        this.numeVersiune = numeVersiune;
    }

    public void setAnInceputFabricatie(String anInceputFabricatie) {
        this.anInceputFabricatie = anInceputFabricatie;
    }

    public void setAnFinalFabricatie(String anFinalFabricatie) {
        this.anFinalFabricatie = anFinalFabricatie;
    }   

    @Override
    public String toString() {
        return numeVersiune;
    }   
    
}
