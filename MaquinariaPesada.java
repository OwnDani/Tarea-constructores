public class MaquinariaPesada {
    String nombre;
    String color;
    String modelo;
    double ancho;
    double largo;
    double alto;
    boolean equipamiento;
    boolean sistemaRodaje;
    double pesoMaq;
    double pesoOperar;
    double potenciaMotor;
    double capCombus;
    

    MaquinariaPesada(String nom, String col, String mod, double anc, double lar, double alt, boolean equi, boolean sis, double pesMaq, double pesOp, double potMot, double capCom){
        this.nombre = nom;
        this.color = col;
        this.modelo = mod;
        this.ancho = anc;
        this.largo = lar;
        this.alto = alt;
        this.equipamiento = equi;
        this.sistemaRodaje = sis;
        this.pesoMaq = pesMaq;
        this.pesoOperar = pesOp;
        this.potenciaMotor = potMot;
        this.capCombus = capCom;
        
    }

    void empujar(){
        System.out.println("La maquina " + nombre + " está empujando 10 ton, de las " + pesoOperar + " ton que tiene como capacidad de operar.");
    }

    void excavar(){
        System.out.println("La maquina " + nombre + " está excavando hasta una profundidad de 5 metros, ya que es un modelo " + modelo);
    }

    void nivelar(){
        System.out.println("La maquina " + nombre + " está nivelando el terreno.");
    }

    void demoler(){
        System.out.println("La maquina " + nombre + " está demoliendo una estructura a remodelar.");
    }

    void arrastrar(){
        System.out.println("La maquina " + nombre + " está arrastrando un volteo que se fue a la cuneta.");
    }
}
