
public class switch_sentence {

	public static void main(String[] args) {
		
		int n = 10;
		
		if (n == 1) {
		    System.out.println("Monday if");

		}else if (n == 2) {
		    System.out.println("Tuesday if");

		}else if (n == 3) {
		    System.out.println("Wednesday if");

		}else if (n == 4) {
		    System.out.println("Thursday if");

		}else if (n == 5) {
		    System.out.println("Friday if");

		}else if (n == 6) {
		    System.out.println("Saturday if");

		}else if (n == 7) {
		    System.out.println("Sunday if");

		}else {
			System.out.println("pene if");
		}
		
		switch (n) {
		  case 1:
		    System.out.println("Monday switch");
		    break;
		  case 2:
		    System.out.println("Tuesday switch");
		    break;
		  case 3:
		    System.out.println("Wednesday switch");
		    break;
		  case 4:
		    System.out.println("Thursday switch");
		    break;
		  case 5:
		    System.out.println("Friday switch");
		    break;
		  case 6:
		    System.out.println("Saturday switch");
		    break;
		  case 7:
		    System.out.println("Sunday switch");
		    break;
		  default:
			  System.out.println("pene switch");
		}

	}

}
