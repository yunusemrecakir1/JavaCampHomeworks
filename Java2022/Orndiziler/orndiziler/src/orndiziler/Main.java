package orndiziler;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.8, 9.8, 6.5, 3.4, 7.1 };
		double total = 0;
		double max=myList[0];
		for (double number : myList) {
			total = total + number;
			System.out.println(number);
			if(number>max) {
				max=number;
			}
		}
		System.out.println("Toplam = "+total);
		System.out.println("En büyük = "+max);
	}
}