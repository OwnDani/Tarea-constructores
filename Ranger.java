public class Ranger extends Raptors {
    private String modelo;
    private double kmRecorrido;
    private int tamañoRin;
    TanqueGas tanqueGas;  

    Ranger() {}

    Ranger(double dimensiones, double velocidadMax, double capCarga, double potenciaMotor, String color, int capPasajeros, String refaccion, String modelo, double kmRecorrido, int tamañoRin, double capacidad, String tipo, int nivel){
        super(dimensiones, velocidadMax, capCarga, potenciaMotor, color, capPasajeros, refaccion);
        this.modelo = modelo;
        this.kmRecorrido = kmRecorrido;
        this.tamañoRin = tamañoRin;
        this.tanqueGas = new TanqueGas(capacidad, tipo, nivel);
    }

    void transporte(){        
        System.out.println("La Ranger Raptor transporta su limite de carga en bultos de cemento.");
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorrido() {
        return this.kmRecorrido;
    }
    public void setKmRecorrido(double kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    public int getTamañoRin() {
        return this.tamañoRin;
    }
    public void setTamañoRin(int tamañoRin) {
        this.tamañoRin = tamañoRin;
    }   




}