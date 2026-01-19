import java.util.*;
//Palindrome number
public class Assign3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int reverse = 0;
		
		while(no != 0) {
			int r = no % 10;
			reverse = reverse*10 + r;
			no = no/10;
		}
		System.out.println("Palindrome of number is"+ reverse);
		
	}

}
