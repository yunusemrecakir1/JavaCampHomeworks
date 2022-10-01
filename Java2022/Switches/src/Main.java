
public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Harika : Geçtin");
			break;
		case 'B':
			System.out.println("İyi : Geçtin");
			break;
		case 'C':
			System.out.println("İdare eder : Geçtin");
			break;
		case 'D':
			System.out.println("Kılpayı : Geçtin");
			break;
		case 'F':
			System.out.println("Kaldın");
			break;
		default:
			System.out.println("Geçersiz Not");
		}

	}
}