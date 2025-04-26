public class Tanquegas{
    private double capacidad;
    private String tipo;
    private int nivel;

    Tanquegas(){}

    Tanquegas(double cap, String tip, int niv){
        this.capacidad = cap;
        this.tipo = tip;
        this.nivel = niv;
    }
    
    public double getCapacidad() {
        return this.capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return this.nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


}