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
        int[][]mat=llenar(tam);
        imp(mat);
        System.out.println("");
        System.out.println("Matriz Ordenada:");
        
    }
    public static int[]mediano(int[][]mat){
        int[]medianos=new int[mat.length];
    return null;
        
    }
    /*public static int[][] organizar(int[][]mat){
        if(mat.length == 0){
            return mat[0];
        }else{
            
        return mat[mat.length][mat.length]+organizar(mat);
    }
    return mat;  
    }*/
    public static int[][] llenar(int tam){
        int[][] mat=new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mat[i][j]=rand.nextInt(10);
            }
        }
    return mat;
    }
    public static void imp(int[][] mat){
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
