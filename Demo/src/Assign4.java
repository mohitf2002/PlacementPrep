import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b +" ");
		
		for(int i=1;i<=t-2;i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}

	}

}
