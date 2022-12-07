/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooej6;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera(200, 150);
        
        
        System.out.println("Tamaño de la taza:");
        int tamaño = leer.nextInt();
                      
        llenarCafetera(c1);
        System.out.println(servirTaza(tamaño, c1));
        vaciarCafetera(c1);
        
        System.out.println("Ingrese la cantidad de cafe a añadir:");
        int cantidad = leer.nextInt();
        
        agregarCafe(cantidad, c1);
        
        System.out.println(c1.toString());
    }
    
     public static void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
    }
    
    public static String servirTaza(int tamañoTaza, Cafetera c1){
        String cantidad;
        if (c1.getCantidadActual() < tamañoTaza){
           cantidad = "La taza solo contiene " + c1.getCantidadActual() + " de café";          
        } else {
           cantidad = "La taza está llena";
        }
        
        return cantidad;
    }
    
    public static void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        
    }
    
    public static void agregarCafe(int cantidad, Cafetera c1){
        c1.setCantidadActual(cantidad);
        
    }
}
