public class Main {
    public static void main (String[] args) {

        Edificio ed = new Edificio(9.5, 4, 10, "Calle Nuevo Léon", true, "Blanco", "Azul", 20);

        ed.almacenar();
        ed.resguardar();
        ed.operar();

        FordRangerRaptor frr = new FordRangerRaptor(5.20, 180, 600, 405, "negro", 5, "Neumatico de repuesto", 120, "Gasolina", 60);

        frr.acelerar();
        frr.saltar();
        frr.mobilidad();
        frr.recreacion();
        frr.transporte();

        MaquinariaPesada maqPes = new MaquinariaPesada("excavadora", "amarilla", "Cat 320", 3.20, 9.5, 3.10, true, false, 7.45, 22, 157);

        maqPes.empujar();
        maqPes.excavar();
        maqPes.nivelar();
        maqPes.demoler();
        maqPes.arrastrar();



        frr.tanqueGas.setNivel(100);
        int estadoTan = frr.tanqueGas.getNivel();
        System.out.println("Tiene " + estadoTan + " litros de gasolina.");
        


    }
}
