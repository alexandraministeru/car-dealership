package model;


public class Marca {
    
    private int marcaId;
    private String numeMarca;

    public Marca(int marcaId, String numeMarca) {
        this.marcaId = marcaId;
        this.numeMarca = numeMarca;
    }

    public String getNumeMarca() {
        return numeMarca;
    }

    public void setNumeMarca(String numeMarca) {
        this.numeMarca = numeMarca;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }

    @Override
    public String toString() {
        return numeMarca;
    }   
    
}
