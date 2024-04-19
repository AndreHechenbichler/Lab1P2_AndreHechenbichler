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
static int[][] mat2=new int[0][0];
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
        mat2=mat;
        System.out.println("Matriz Ordenada:");
        for (int i = 0; i < 2; i++) {
            int cont=0;
        mat=bubble(mat,cont);
        }
        imp(mat);
        
        System.out.println("calcular medianas");
        ArrayList<Integer>lista=new ArrayList();
        mediano(mat,lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.println("");
        
    }
    public static int[][]bubble(int[][]mat,int cont){
        for (int i = 0; i < mat.length; i++) {
            if (i==3&&cont<mat.length-1) {
                return bubble(mat, cont+1);
            }else{
                if(i<=mat.length-2){
                    int num1=mat2[cont][i+1];
                    int num2=mat2[cont][i];
                    if(mat[cont][i]>mat[cont][i+1]){
                        mat[cont][i]=num1;
                        mat[cont][i+1]=num2;
                    }
                }
                
                
                
            }
        }
    return mat;  
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
