import java.util.Scanner;



public class ArrayEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��� 5���� �Է��ϼ���: ");
		
		int arr[] = new int[5];
		
		int max = 0;
		
		for(int i =0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("���� ū ����"+max);
		
		
	}
}
