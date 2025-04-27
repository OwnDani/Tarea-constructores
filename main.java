public class Main {
    public static void main (String[] args) {

        Raptors [] raptors = {new Ranger(), new LoboR(), new Bronco()};

        for (int i = 0; i < raptors.length; i++) {
            if (raptors[i] instanceof LoboR) {
                System.out.println("La LoboR va a acelerar");
                raptors[i].acelerar();
            } else System.out.println("La " + raptors[i].getClass().getSimpleName() + " no hizo nada");

        }

        raptors[0].setDimensiones(5.95);
        raptors[0].setVelocidadMax(180);
        raptors[0].setCapCarga(800);
        raptors[0].setPotenciaMotor(405);
        raptors[0].setColor("Blanco");
        raptors[0].setCapPasajeros(5);
        raptors[0].setRefaccion("Neumático");
        /* raptors[0].setModelo("2025");
        raptors[0].setKmRecorrido(120);
        raptors[0].setTamañoRin(17); */

        raptors[1].setDimensiones(6.20);
        raptors[1].setVelocidadMax(200);
        raptors[1].setCapCarga(1200);
        raptors[1].setPotenciaMotor(750);
        raptors[1].setColor("Negro");
        raptors[1].setCapPasajeros(5);
        raptors[1].setRefaccion("Neumático");
        /* raptors[0].setModelo("2025");
        raptors[0].setKmRecorrido(120);
        raptors[0].setTamañoRin(17); */

        raptors[2].setDimensiones(5.00);
        raptors[2].setVelocidadMax(180);
        raptors[2].setCapCarga(450);
        raptors[2].setPotenciaMotor(410);
        raptors[2].setColor("Rojo");
        raptors[2].setCapPasajeros(5);
        raptors[2].setRefaccion("Neumático");
        /* raptors[0].setModelo("2025");
        raptors[0].setKmRecorrido(120);
        raptors[0].setTamañoRin(17); */     
        
        System.out.println("  ");
        System.out.println("La " + raptors[0].getClass().getSimpleName() + " Raptor tiene una dimensión de " + raptors[0].getDimensiones() + " metros de largo.");
        System.out.println("La " + raptors[1].getClass().getSimpleName() + " Raptor tiene una dimensión de " + raptors[1].getDimensiones() + " metros de largo.");
        System.out.println("La " + raptors[2].getClass().getSimpleName() + " Raptor tiene una dimensión de " + raptors[2].getDimensiones() + " metros de largo.");

            
        
        

            

        

        


    }
}
