
package ec.edu.espoch.exercise1group;

import ec.edu.espoch.exercise1group.clases.Automovil;
import ec.edu.espoch.exercise1group.enumeraciones.Colores;
import ec.edu.espoch.exercise1group.enumeraciones.TipoAutomovil;
import ec.edu.espoch.exercise1group.enumeraciones.TipoCombustible;


public class Exercise1Group {

    public static void main(String[] args) {
       
        Automovil cocheUno=new Automovil("FORD ", 2000, 18.4, TipoCombustible.BIODIESEL, TipoAutomovil.CIUDAD, Colores.AZUL, 4, 5, 125, 0);
        System.out.println(cocheUno.toString());
        //la velocidad actual ahora es 100 km/h
        cocheUno.setVeloActual(100);
        System.out.println("La velocidad ahora es: "+cocheUno.getVeloActual());
        //la velocidad ahora aumenta con 20 km/h
        cocheUno.acelerarvehi(20);
        System.out.println("La velocidad aumentada ahora es: "+cocheUno.getVeloActual());
        //Ahora desacelera el coche a 50 km/h, segun el enunciado
        cocheUno.desacelerarvehi(50);
        System.out.println("La velocidad desacelerada ahora es: "+cocheUno.getVeloActual());
        //el coche ya frena 
        cocheUno.frenar();
        System.out.println("El coche frenado queda en : "+cocheUno.getVeloActual());
       
        System.out.println("");
        System.out.println("");
        
        Automovil cocheDos=new Automovil("ferrari ", 2015, 20.5, TipoCombustible.BIOETANOL, TipoAutomovil.EJECUTIVO, Colores.AMARILLO, 2, 3, 335, 0);
        System.out.println(cocheDos.toString());
        
        cocheDos.setVeloActual(80);
        System.out.println("La velocidad ahora es: "+cocheDos.getVeloActual());
        cocheDos.acelerarvehi(20);
        System.out.println("La velocidad aumentada ahora es: "+cocheDos.getVeloActual());
        cocheDos.desacelerarvehi(50);
        System.out.println("La velocidad desacelerada ahora es: "+cocheDos.getVeloActual());
        cocheDos.frenar();
        System.out.println("El coche frenado queda en : "+cocheDos.getVeloActual());
    }
}
