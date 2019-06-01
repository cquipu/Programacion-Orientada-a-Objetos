package arrays;

import java.util.Scanner;

public class aplicacion6 {
	public static void main(String[] args) {
		
		Scanner reader = new  Scanner(System.in);		
		int filas, columnas; 
		
		System.out.print("Ingrese la dimension de la matriz cuadrada:");
		filas=reader.nextInt();
		columnas=filas;
		
		int[][] matrix=new int[filas][columnas];
		int[][] matrix2=new int[filas][columnas];
		
		System.out.println("Ingrese de la matriz a A:");
		for(int fila=0;fila<matrix.length; fila++){			
            for(int colum=0;colum<matrix.length; colum++){
            	System.out.print("A["+fila+"]["+colum+"]=");
                matrix[fila][colum]=reader.nextInt();
            }
        } 
		
		System.out.println("Ingrese de la matriz a B:");
		for(int fila=0;fila<matrix2.length; fila++){			
            for(int colum=0;colum<matrix2.length; colum++){
            	System.out.print("B["+fila+"]["+colum+"]=");
                matrix2[fila][colum]=reader.nextInt();
            }
        } 
		
		System.out.println("La suma de matrices A + B es :");
		for(int fila=0;fila<matrix2.length; fila++){
            for(int colum=0;colum<matrix2.length; colum++){
            	System.out.print((matrix[fila][colum]+matrix2[fila][colum])+" ");
            }
            System.out.println(" ");
        } 
		
	}

}
