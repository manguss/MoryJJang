import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		int a = scanner.nextInt();
		
		for(int i = a; i > 0; i--) {
			for(int j =0; j <i; j++)
				System.out.println("*");
			
		}
	}
}
