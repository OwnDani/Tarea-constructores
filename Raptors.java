public class Raptors{
    private double dimensiones;
    private double velocidadMax;
    private double capCarga;
    private double potenciaMotor;
    private String color;
    private int capPasajeros;
    private String refaccion;
    
    Raptors() {}
    
    Raptors(double dim, double vel, double cCarga, double potMotor, String col, int capPas, String refac){
        this.dimensiones = dim;
        this.velocidadMax = vel;
        this.capCarga = cCarga;
        this.potenciaMotor = potMotor;
        this.color = col;
        this.capPasajeros = capPas;
        this.refaccion = refac;
                
    }

    public double getDimensiones() {
        return this.dimensiones;
    }
    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public double getVelocidadMax() {
        return this.velocidadMax;
    }
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getCapCarga() {
        return this.capCarga;
    }
    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }

    public double getPotenciaMotor() {
        return this.potenciaMotor;
    }
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getCapPasajeros() {
        return this.capPasajeros;
    }
    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public String getRefaccion() {
        return this.refaccion;
    }
    public void setRefaccion(String refaccion) {
        this.refaccion = refaccion;
    }


    void acelerar(){
        System.out.println("VROOOOM BROOOUUM");
    }

    void acelerar(double time){
        System.out.println("La Raptor hizo el 0 a 100 en " + time + " segundos ");
    }

    void saltar(){
        System.out.println("La Raptor saltó por su velocidad máxima que es de " + velocidadMax + " km/h.");
    } 
    
    void atravesar(){
        System.out.println("La Raptor atraviesa un terreno rocoso");
    }

    void remolcar(){
        System.out.println("La Raptor arrastra un remolque para caballos");
    }
   
   

}
