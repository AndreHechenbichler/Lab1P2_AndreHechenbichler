/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_andrehechenbichler;
import java.util.Random;
import java.util.Scanner;
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
        mat=organizar(mat);
        imp(mat);
    }
    public static int[]mediano(int[][]mat){//scar el medio
        int[]medianos=new int[mat.length];
    return null;
        
    }//fin mediano
    public static int[][] organizar(int[][]mat){//organizar matriz
        int[][]mat2=mat;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j]<mat[i][j+1]) {
                    mat[i][j]=mat2[i][j+1];
                    mat[i][j+1]=mat2[i][j];
                    return mat;
                }else{
                    return mat;
                }
            }
        }
    return mat;  
    }//fin organizar
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
