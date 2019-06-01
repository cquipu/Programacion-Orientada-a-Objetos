package arrays;

import java.util.Scanner;

public class aplicacion2 {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		
		int[] numero=new int[4];
		
		for(int i=0; i<numero.length; i++){
			System.out.print("vector["+i+"]=");
			numero[i]=reader.nextInt();
		}
				
		for(int i=0; i<numero.length; i++){
			System.out.print(numero[i]+" ");
		}
		
	}
		
}
