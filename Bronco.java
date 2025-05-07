public class Bronco extends Raptors {
    private String modelo;
    private double kmRecorrido;
    private int tamañoRin;
    TanqueGas tanqueGas;

    Bronco() {}

    Bronco(double dimensiones, double velocidadMax, double capCarga, double potenciaMotor, String color, int capPasajeros, String refaccion, String modelo, double kmRecorrido, int tamañoRin){
        super(dimensiones, velocidadMax, capCarga, potenciaMotor, color, capPasajeros, refaccion);
        this.modelo = modelo;
        this.kmRecorrido = kmRecorrido;
        this.tamañoRin = tamañoRin;
    }

    void campo(){        
        System.out.println("La Bronco Raptor se desenvuelve bien en terrenos rocosos");
    }
    void campo(String terre){
        System.out.println("La Bronco Raptor está atravesando un terreno " + terre + ", la cual se desenvuelve bien.");
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