package perfectnum;

public class Main {

	public static void main(String[] args) {
		int sayi=28;
		int bolen=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolen=bolen+i;
				if(sayi==bolen) {
				 System.out.println(sayi+" mükemmel sayıdır.");
				}
			}
			
		}
		if(sayi!=bolen) {
			System.out.println(sayi+" mükemmel sayı değildir.");
		}
		System.out.println("Bölenlerin toplamı : "+bolen);
	}
}