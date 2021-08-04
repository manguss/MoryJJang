
import java.util.Scanner;
import java.util.Random;

public class Randomarray2 {

	public static boolean exists(int a[], int from, int r) {
		for (int i = 0; i < from; i++) {
			if (a[i]==r) {
				return true;
			}
			
		}
		return false;
		
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 몇개?: ");
		int n = scanner.nextInt();
		int  arr [] = new int [n];
		
		

		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100+1);
			int r = (int)(Math.random()*100+1);
			if(exists(arr, i, r)) {
				i--;
				continue;
			}
			arr[i] = r;
		}
	
		for (int i = 0; i < arr.length; i++) {
		if((i+1)==0) {
			System.out.print(arr[i]+" ");
		}else {
		if(i%10 == 0) {
			System.out.println();
		}
	
		}
		System.out.print(arr[i]+ " ");
}




}
}

