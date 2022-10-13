package abstractClasses;

public abstract class BaseCalculator {
	
	//abstract kullanılan metotların kullanımı zorunlu ama değişkenlik gösterir 
	public abstract void hesapla();
	
	//final kullanılan metotlar kullanımı zorunlu kılar
	public final void gameOver() {
		System.out.println("Over");
		
	}
}