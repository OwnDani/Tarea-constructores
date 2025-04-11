public class main {
    public static void main (String[] args) {

        Edificio ed = new Edificio(9.5, 4, 10, "Calle Nuevo Léon", true, "Blanco", "Azul", 20);

        ed.almacenar();
        ed.resguardar();
        ed.operar();

        FordRangerRaptor frr = new FordRangerRaptor(5.20, 180, 600, 405, "negro", 5, true, "Neumatico de repuesto");

        frr.acelerar();
        frr.saltar();
        frr.mobilidad();
        frr.recreacion();
        frr.transporte();

        MaquinariaPesada maqPes = new MaquinariaPesada("excavadora", "amarilla", "Cat 320", 3.20, 9.5, 3.10, true, false, 7.45, 22, 157, 390);

        maqPes.empujar();
        maqPes.excavar();
        maqPes.nivelar();
        maqPes.demoler();
        maqPes.arrastrar();
        


    }
}
