import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.println("���ڸ� �Է��Ͻÿ�: ");
		dividend = scanner.nextInt();
		System.out.println("�и� �Է��Ͻÿ�: ");
		divisor = scanner.nextInt();
		System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�");
		
	}
}
