import java.util.*;

public class Assign1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		
		if(no%3 ==0 && no%7 == 0) {
			System.out.println("fun-buzz");
			return;
		}
		else if(no%7 == 0){
			System.out.println("buzz");
		}
		else if(no%3 == 0) {
			System.out.println("fun");
		}
	}

}
