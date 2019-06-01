package arrays;

public class aplicacion1 {

	public static void main(String[] args) {
		
		int[] vector = new int[5];
		
		vector[0]=10;
		vector[1]=6;
		vector[2]=-4;
		vector[3]=1;
		vector[4]=-1;				
		
		// Usamos un ciclo for para recorrer
		// todos los elementos del array
		for(int i=0; i<vector.length;i++){
			System.out.print(vector[i]+" ");
		}
	}

}
