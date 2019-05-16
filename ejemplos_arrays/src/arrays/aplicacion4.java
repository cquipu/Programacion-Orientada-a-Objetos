package arrays;

public class aplicacion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= new int[2][2];
        matrix[0][0]=2;
        matrix[0][1]=0;
        matrix[1][0]=-2;
        matrix[1][1]=7;
        
        for(int fila=0;fila<matrix.length; fila++){
            for(int colum=0;colum<matrix.length; colum++){
                System.out.print(matrix[fila][colum]+" ");
            }
            System.out.println(" ");
        }

	}

}
