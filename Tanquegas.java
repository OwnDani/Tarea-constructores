public class TanqueGas{
    private double capacidad;
    private String tipo;
    private int nivel;

    TanqueGas(){}

    TanqueGas(double capacidad, String tipo, int nivel){
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.nivel = nivel;
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