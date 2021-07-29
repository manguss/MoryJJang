import java.util.Scanner;



public class ArrayEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요: ");
		
		int arr[] = new int[5];
		
		int max = 0;
		
		for(int i =0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("가장 큰 수는"+max);
		
		
	}
}
