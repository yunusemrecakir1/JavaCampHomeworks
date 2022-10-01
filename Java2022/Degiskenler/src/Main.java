
public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		int c = 32;
		int enbuyuk=a;
		if(b>enbuyuk) {
			enbuyuk=b;
		}
		else if(c>enbuyuk){
			enbuyuk=c;
		}
		else {
			System.out.println("En büyük "+enbuyuk+" dir.");
		}
	}
}
