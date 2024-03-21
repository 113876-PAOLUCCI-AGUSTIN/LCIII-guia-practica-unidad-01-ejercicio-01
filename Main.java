/*
 * 1. Declarar dos variables enteras y cargar sus valores por teclado.
 * Informar su suma, diferencia, producto y cociente.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese por teclado dos números enteros");
        Integer miVariable01 = teclado.nextInt();
        Integer miVariable02 = teclado.nextInt();
    }
    
    public static Integer sumarVariables(Integer primerNumero, Integer segundoNumero){
        return primerNumero + segundoNumero;
    }
    public static Integer restarVariables(Integer primerNumero, Integer segundoNumero){
        return primerNumero - segundoNumero;
    }
    public static Integer multiplicarVariables(Integer primerNumero, Integer segundoNumero){
        return primerNumero * segundoNumero;
    }
    public static Integer dividirVariables(Integer primerNumero, Integer segundoNumero){
        return primerNumero / segundoNumero;
    }
}
