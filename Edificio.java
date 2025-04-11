public class Edificio {
    double altura;
    int nivel;
    double ancho;
    String ubicacion;
    boolean cuentaConLuz;
    String colorExt;
    String colorInt;
    int puertas;

    Edificio(double alt, int niv, double anc, String ubi, boolean cCL, String colExt, String colInt, int puert){
        this.altura = alt;
        this.nivel = niv;
        this.ancho = anc;
        this.ubicacion = ubi;
        this.cuentaConLuz = cCL;
        this.colorExt = colExt;
        this.colorInt = colInt;
        this.puertas = puert;

    }

    void almacenar(){
        System.out.println("El edificio guarda mobiliario de oficina");
    }

    void resguardar(){
        System.out.println("El edificio cuenta con personal laburando");
    }

    void operar(){
        System.out.println("EL edificio funciona para auditorías");
    }
}