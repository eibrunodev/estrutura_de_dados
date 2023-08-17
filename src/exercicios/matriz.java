package exercicios;

import java.util.Iterator;

public class matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[2][2];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;		
		System.out.println("|------|");
		for(int i = 0; i< 2; i++) {
			System.out.print("|");
			for (int j = 0; j < 2; j++) {				
				System.out.print(" "+matriz[i][j]+" ");		
			}
			System.out.print("|");
			System.out.println("");
		}
		
		System.out.println("|------|");
	}

}
