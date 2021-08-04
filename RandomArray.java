

import java.util.Scanner;
import java.util.Random;

public class RandomArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수 몇개?: ");
	int a = scanner.nextInt();
	int  arr [] = new int [a];
	
	
	for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
	for (int i = 0; i < arr.length; i++) {
		if(i==0) {
			System.out.print(arr[i]+" ");
		}else {
		if(i%10 == 0) {
			System.out.println();
		}
		System.out.print(arr[i]+ " ");
}
}
}
}
