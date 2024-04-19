/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_andrehechenbichler;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//fila 2 columna 8
/**
 *
 * @author andre
 */
public class Lab1P2_AndreHechenbichler {
static Scanner leer=new Scanner(System.in);
static Random rand=new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese tamaño de la matriz deseada:");
        int tam=leer.nextInt();
        int[][]mat=llenar(tam);//llamar y imprimir matriz
        imp(mat);
        System.out.println("");
        System.out.println("Matriz Ordenada:");
        //mat=prueba(mat);
        //imp(mat);
        System.out.println("calcular medianas");
        ArrayList<Integer>lista=new ArrayList();
        mediano(mat,lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.println("");
    }
    public static int[][]bubble(int[][]mat){
        
    return null;  
    }
    public static void mediano(int[][]mat, ArrayList<Integer>lista){//scar el medio
        for (int i = 0; i < mat.length; i++) {
            int tam=0;
            for (int j = 0; j < mat[0].length; j++) {
                tam+=mat[i][j];
            }
            tam=tam/mat.length;
            lista.add(tam);
        }
    }//fin mediano
    public static int[][] llenar(int tam){//llena la matriz
        int[][] mat=new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mat[i][j]=rand.nextInt(10);
            }
        }
    return mat;
    }//fin metodo
    public static void imp(int[][] mat){//imprime la matriz
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }//fin metodo
}
