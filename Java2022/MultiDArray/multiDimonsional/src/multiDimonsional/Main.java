package multiDimonsional;

public class Main {

	public static void main(String[] args) {
		//int[][] dizi = new int[10][10];
		//deneme
		int[][] dizi= {
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9}
		};
		
		for (int i = 0; i < (dizi[i].length); i++) {
			for (int j = 0; j < (dizi[i].length); j++) {
				dizi[i][j] = j;
				System.out.println(dizi[i][i]+" : "+dizi[i][j]);
			}
			System.out.println("--------------------");
		}
	}
}