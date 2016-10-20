/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;
import java.util.*;
/**
 *Programa que sirva para convertir de km/h a m/s
 * @author JorgeRicardo
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double kporh,mpors;/*dos variables la de km/h y el 
                         resultado de combertirlos m/s*/
    kporh=pedirk();
    mpors=comver(kporh);
    mostrarCom(kporh,mpors);   
    }
    public static double pedirk(){//en este metodo pido los km/h
    double n;
    Scanner escribe=new Scanner(System.in);
    System.out.println("Escribe el numero de km/h que quieras covertir a m/s ");
    n=escribe.nextDouble();
    return n;
    }
    public static double comver(double medida){
    double res=medida/3.6;
    return res;
    }
    public static void mostrarCom(double primer,double segundo){
     //imprimir el resultado
        System.out.println(primer+"km/h es igual a "+segundo+"m/s");
    }        
}
