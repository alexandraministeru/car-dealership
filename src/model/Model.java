package model;


public class Model {
    
    int modelId;
    int marcaId;
    String numeModel;

    public Model(int modelId, int marcaId, String numeModel) {
        this.modelId = modelId;
        this.marcaId = marcaId;
        this.numeModel = numeModel;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }

    public String getNumeModel() {
        return numeModel;
    }

    public void setNumeModel(String numeModel) {
        this.numeModel = numeModel;
    }    

    @Override
    public String toString() {
        return numeModel;
    }   
    
}
