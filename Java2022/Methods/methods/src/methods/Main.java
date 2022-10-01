package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();
		
	}
	public static void sayiBulma() {
		int[] sayilar = new int[] {8,6,9,4,2,3,5,1,};
		int aranacak = 5;
		boolean varMi=false;
		for( int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Sayı mevcuttur : "+aranacak);
		}
		else {
			mesajVer("Sayı mevcut değildir : "+aranacak);		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}