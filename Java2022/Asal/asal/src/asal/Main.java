package asal;

public class Main {

	public static void main(String[] args) {
		int a = 8;
		boolean prime = false;
		
		if(a==1) {System.out.println("Geçersiz Sayıb ");}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = false;
			} 
		}
		if(prime==true)
		{System.out.println(a+" asaldır.");}
		else {System.out.println(a+" asal değildir.");}
		
}
}