package studio3;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		System.out.println("Enter 'n':");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p = 2;
		boolean[] numList = new boolean[n-1];
	
		for (int i=0; i<numList.length; i++ ) {
			if (i>1) {
				numList [i] = true;
			}
		}

		
		for (int i=2; i<numList.length; i++) {
			for (int j=i+i; j<numList.length; j= j+i) {
				numList [j] = false;
			}
		}
		for (int i=2; i<numList.length; i++) {
			if (numList[i] == true) {
				System.out.println(i);
			}
		
		}
	}
}

