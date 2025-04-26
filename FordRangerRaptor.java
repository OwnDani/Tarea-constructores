public class FordRangerRaptor {
    private double dimensiones;
    private double velocidadMax;
    private double capCarga;
    private double potenciaMotor;
    private String color;
    private int capPasajeros;
    private String refaccion;
    Tanquegas tanqueGas;
    
    FordRangerRaptor(double dim, double vel, double cCarga, double potMotor, String col, int capPas, String refac){
        this.dimensiones = dim;
        this.velocidadMax = vel;
        this.capCarga = cCarga;
        this.potenciaMotor = potMotor;
        this.color = col;
        this.capPasajeros = capPas;
        this.refaccion = refac;
                
    }

    FordRangerRaptor(double dim, double vel, double cCarga, double potMotor, String col, int capPas, String refac, double capacidad, String tipo, int nivel){
        this.dimensiones = dim;
        this.velocidadMax = vel;
        this.capCarga = cCarga;
        this.potenciaMotor = potMotor;
        this.color = col;
        this.capPasajeros = capPas;
        this.refaccion = refac;
        this.tanqueGas = new Tanquegas(capacidad, tipo, nivel);
                
    }


    void acelerar(){
        System.out.println("La Raptor aceleró de 0 a 100 en 7 seg.");
    }

    void saltar(){
        System.out.println("La Raptor saltó por su velocidad máxima que es de " + velocidadMax + " km/h.");
    }

    void mobilidad(){
        System.out.println("La Raptor la están usando para uso recreativo.");
    }

    void recreacion(){
        System.out.println("La Raptor se desenvuelve muy bien en terrenos irregulares.");
    }

    void transporte(){
        System.out.println("La Raptor transporta su limite de carga que es de " + capCarga + " kilos en tomates.");
    }

}
