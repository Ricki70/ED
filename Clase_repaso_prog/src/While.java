
public class While {

	public static void main(String[] args) {
		
		int n = 0;
		
		while (n > 5) {
			System.out.println("while");
			n++;
		}
		
		do {
			System.out.println("do while");
			n++;
		} while(n < 5);

	}

}
