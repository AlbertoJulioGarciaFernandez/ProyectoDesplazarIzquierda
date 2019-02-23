package proyectodesplazarizqda;
import java.util.Scanner;
/**
 *  **PRO (UT6) - Ejercicios**
 * 4.- Desplazar_izquierda: Realizar  un programa que desplace hacia la izquierda 
 * a los elementos de un array, el array tendrá un número n de elemento a decidir 
 * por el usuario. Cuando se desplaza hacia la izquierda el primer elemento se 
 * perderá
 * 
 * @author Alberto Julio García Fernández
 */
public class ProyectoDesplazarIzqda {        
    public static void main(String[] args) {        
        int num, pos, n, aux;
        Scanner sc;
        sc=new Scanner(System.in);
        
        System.out.println("\t**EJERCICIO 4 - DESPLAZAMIENTO ELEMENTOS A LA "
                + "IZQUIERDA**");
        System.out.println("Por favor, introduzca el número de elementos que "
                + "desea que tenga su array:");
        num=sc.nextInt();
        
        //Bloque de validación:
        while(num<0){
            System.out.println("Se ha producido un error");
            System.out.println("Por favor, introduzca un número de elementos mayor "
                + "que cero:");
            num=sc.nextInt();
        }
        
        int[] array;//Definición de variable de tipo Array        
        array=new int[num];//Creación de un objeto de la clase Array
        
        System.out.println("Ahora, por favor, rellene el array con valores "
                + "enteros:");
        for(pos=0;pos<array.length;pos++){
            System.out.print("Posición "+(pos+1)+"-> ");
            array[pos]=sc.nextInt();
        }
        
        System.out.println("El array (sin tratar) es el siguiente:");
        for(pos=0;pos<array.length;pos++){
            System.out.println("Posición "+(pos+1)+"-> "+array[pos]);         
        }        
        
        for(pos=0;pos<array.length-1;pos++){/*Vamos recorriendo el array desde 
            su comienzo (posición 0), hasta la posición length-1, y substituyendo 
            el elemento de la posición en la que nos encontremos, con el elemento 
            de la posición pos+1*/                      
            array[pos]=array[pos+1];  
            
            if(pos==array.length-2){/*Cuando lleguemos a la posición length-2, 
                substituiremos el valor del último elemento con un cero, ya que 
                si no, los valores de las posiciones length-1 y length-2 saldrían 
                repetidos:*/
                array[pos+1]=0;
            }
        }                                               
        
        System.out.println("El array ha quedado de la siguiente manera (el primer "
                + "elemento se ha perdido como consecuencia del desplazamiento a "
                + "la izquierda de los elementos):");
        for(pos=0;pos<array.length;pos++){
            System.out.println("Posición "+(pos+1)+"-> "+array[pos]);         
        }
    }    
}
