package string;
import java.util.Scanner;
public class tester {	
		public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String in = sc.nextLine();
			SpecialCharacter c = new SpecialCharacter(in);
			System.out.println(c.getSpecialCharacter());
	}
}
