import java.util.*;

public class App {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int count = 1;
		System.out.println("Random number between "+min+" and "+max);
		int b = (int)(Math.random()*(max-min+1)+min);
		System.out.println("The random number is : " + b);
		
		for(int i=0;i<100;i++) {
		Scanner s = new Scanner(System.in);
		System.out.print(" enter the number :");
		int v = s.nextInt();
		System.out.println(v);
		if(v==b ) {
		    break;		
		}
		else {
			count++;
			System.out.println("not match , try again ........");
        }
		}
		System.out.println("u attand "+count+" time to find the currect answer");

		}
}
