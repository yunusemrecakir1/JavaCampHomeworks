package multiDArray;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[][] dizi = new int[10][10];
		
		for (int i = 0; i < (dizi.length); i++) {
			for (int j = 0; j < (dizi.length); j++) {
				dizi[i][j] = j;
				//System.out.println("[" + i + "] : [" + j + "]");
			}
			
			System.out.println("<<");
			
		}

		for (int i = 0; i < (dizi.length); i++) {
			for (int j = 0; j < (dizi.length); j++) {
				
				//System.out.println("[" + i + "] : [" + j + "]");
				
				System.out.println(dizi[i][i] + ":" + dizi[i][j]);
			}
			
			System.out.println("<<");
			
		}
	}
}