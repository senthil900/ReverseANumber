package basictraining;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;a>0;i++) {
			System.out.print(a%10);
			a=a/10;
		}
	}

}
