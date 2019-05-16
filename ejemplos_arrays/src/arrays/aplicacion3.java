package arrays;

import java.util.Scanner;

public class aplicacion3 {

	public static void main(String[] args) {
		
		Scanner reader = new  Scanner(System.in);
		
		int dimension; // indica el tamaño del array
		
		System.out.println("Ingrese la dimension de los vectores:");
		dimension=reader.nextInt();
		
		int[] A=new int[dimension];
		int[] B=new int[dimension];
		
		System.out.println("Ingrese los valores de A:");
		for(int i=0; i<A.length;i++){
			System.out.print("A["+i+"]=");
			A[i]=reader.nextInt();
		}
		
		System.out.println("Ingrese los valores de B:");
		for(int i=0; i<A.length;i++){
			System.out.print("B["+i+"]=");
			B[i]=reader.nextInt();
		}
		
		System.out.println("La suma de A + B es :");
		for(int i=0; i<A.length;i++){
			System.out.print((A[i]+B[i])+" ");
		}	
	}

}
