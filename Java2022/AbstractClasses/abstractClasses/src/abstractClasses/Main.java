package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanCalculator womanCalculator=new WomanCalculator();
		womanCalculator.hesapla();
		womanCalculator.gameOver();
		
		BaseCalculator baseCalculator=new ManCalculator()	;
	}
}