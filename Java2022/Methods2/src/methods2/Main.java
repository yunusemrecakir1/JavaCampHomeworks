package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Hava güzel";
		String yeniMesaj=sehir();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
	}
	public static void ekle(){
		System.out.println("Eklendi");
		
	}
	public static void sil(){
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla(int a,int b) {
		return a+b;
	}
	}
}