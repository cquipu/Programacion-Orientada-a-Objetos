package arrays;
import java.util.Scanner;

public class aplicacion5 {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese la dimesion de la matriz cuadrada: ");
        n=reader.nextInt();
        
        int[][] matrix= new int[n][n]; 
        
        for(int fila=0;fila<matrix.length; fila++){
            for(int colum=0;colum<matrix.length; colum++){
            	System.out.print("matriz["+fila+"]["+colum+"]=");
                matrix[fila][colum]=reader.nextInt();
            }
        }       
        
        for(int fila=0;fila<matrix.length; fila++){
            for(int colum=0;colum<matrix.length; colum++){
                System.out.print(matrix[fila][colum]+" ");
            }
            System.out.println(" ");
        }

	}

}
