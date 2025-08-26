/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riverasegura_250825;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ingresar_datos();
    }
    public static void ingresar_datos(){
        
        //Inicialización de la clase scanner
        Scanner scanner = new Scanner(System.in);
        
        //Declaración de variables a utilizar
        int[] edades = new int[10];
        int suma = 0;
        int total_pares = 0;
        int total_impares = 0;
        
        //Mensaje al usuario
        System.out.println("Ingrese " + edades.length + " edades.");
        
        //Se recorre el arreglo para asignar valor a cada elemento
        for(int i = 0; i < edades.length; i++){
            //Se solicita al usuario el ingreso de un valor
            System.out.println("Edad " + i + ": ");
            
            //Se lee el valor digitado por el usuario
            //y se asigna a la variable de edad que corresponde según
            //la posición en la iteración
            edades[i] = scanner.nextInt();
            
            //Para calcular el promedio, se requiere sumar toda las
            //edades registradas en cada elemento
            suma+= edades[i];
            
            //Establecer si es par o impar
            //calculando el módulo del número digitado
            if((edades [i] % 2) == 0){
                //Es par | se incrementa la variable acumuladora:
                total_pares++;
            }else{
                //Es impar | se incrementa la variable acumuladora:
            total_impares++;
            }
        }   
        //Se calcula el promedio de las edades
        double promedio = (double) suma /edades.length;
        
        //Se imprime la salida
        System.out.println("Usted ha ingresado: " + edades.length + " edades.");
        System.out.println("El promedio de las edades ingresadas es: " + promedio);
        System.out.println("Ingresó " + total_pares + " edades pares y " + total_impares + " edades impares.");
        
        //Se cierra el objeto de tipo scanner, porque ya no habrá más lecturas
        scanner.close();    
    }
}
