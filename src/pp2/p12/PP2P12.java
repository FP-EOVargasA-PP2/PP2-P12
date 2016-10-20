/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p12;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion
        int [] v = new int [10];
        int r;
        //proceso
        v = llenarvector (v);
        r = calcular (v);
        mostrar (r);
    }
    public static int [] llenarvector(int[]v){//mientras i sea menor al tamaño de la posicion
        int i=0;
        Scanner teclado=new Scanner(System.in);
        while (i<v.length){
            System.out.println("Introduce un numero para la posicion "+i);
            v[i]=teclado.nextInt();
            i++;
        }
        return v;
    }
    public static int calcular (int[]v){
        //solo se suman los numeros pares del arreglo
        return (v[2]+v[4]+v[6]+v[8])/4;
    }
    public static void mostrar (int r){
        System.out.println("le medis de los valores de los numeros pares del vector es "+r);
    }
}
