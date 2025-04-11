public class FordRangerRaptor {
    double dimensiones;
    double velocidadMax;
    double capCarga;
    double potenciaMotor;
    String color;
    int capPasajeros;
    boolean gasolina;
    String refaccion; 

    FordRangerRaptor(double dim, double vel, double cCarga, double potMotor, String col, int capPas, boolean gas, String refac){
        this.dimensiones = dim;
        this.velocidadMax = vel;
        this.capCarga = cCarga;
        this.potenciaMotor = potMotor;
        this.color = col;
        this.capPasajeros = capPas;
        this.gasolina = gas;
        this.refaccion = refac;
                
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
