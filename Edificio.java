public class Edificio {
    private double altura;
    private int nivel;
    private double ancho;
    private String ubicacion;
    private boolean cuentaConLuz;
    private String colorExt;
    private String colorInt;
    private int puertas;

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

    public double getAltura(){
        return this.altura;
        
    }
    public int getNivel(){
        return this.nivel;
    }
    public double getAncho(){
        return this.ancho;
    }
    public String getUbicacion(){
        return this.ubicacion;
    } 
    public boolean getCuentaConLuz(){
        return this.cuentaConLuz;
    }
    public String getColorExt(){
        return this.colorExt;
    }
    public String getColorInt(){
        return this.colorInt;
    }
    public int getPuertas(){
        return this.puertas;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setCuentaConLuz(boolean cuentaConLuz){
        this.cuentaConLuz = cuentaConLuz;
    }
    public void setColorExt(String colorExt){
        this.colorExt = colorExt;
    }
    public void setColorInt(String colorInt){
        this.colorInt = colorInt;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
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