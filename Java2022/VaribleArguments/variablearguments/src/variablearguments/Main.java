package variablearguments;

public class Main {

	public static void main(String[] args) {
		int toplam =topla(5,6,8,9);
		System.out.println(toplam);
	}
	public static int topla(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}