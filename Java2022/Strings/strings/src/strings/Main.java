package strings;

public class Main {

	public static void main(String[] args) {
		String mesaj ="What a lovely day.";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(9));
		//charAt() = içine girilen indexdeki elemanı getirir
		System.out.println(mesaj.concat("Is not it"));
		//concat() = stringe ek yapmak için anlık kullanılır
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));
		//startsWith = String eğer fonksiyonun içine girilen karakterle başlıyor ise true değeri verir
		System.out.println(mesaj.endsWith("B"));
		//startsWith = String eğer fonksiyonun içine girilen karakterle bitiyor ise true değeri verir
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		//indexOf() = içine girilen karakterin string deki index numarasını verir ilk bulduğu karakteri verir
		//lastindexOf() = indexOfdan farkı armaya sondan başlar
		System.out.println(mesaj.replace(' ', '_'));
		//replace() = içine girilen değerleri istenilen şekilde değiştirmek için kullanılır. 
		System.out.println(mesaj.substring(2));
		//substring() = içine girilen indexden sonrakinin alır
		//iki değer girilirse başlangıç ve bitiş olarak alır aradakileri alır
		for(String kelime:mesaj.split(" ")){
			System.out.println(kelime);
		}
		//split() = stingdeki kelimeleri ayırır array yapar
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		//toLowerCase() = hepsini küçük harf yapar
		//toUpperCase() = hepsini büyük harf yapar
		System.out.println(mesaj.trim());
		//trim() = başdaki ve sondak, boşlukları siler
		
		
	
	
	
	
	}
}