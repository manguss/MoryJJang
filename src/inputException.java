import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class inputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���.");
		int sum=0, n=0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+": ");
			try {
				n = scanner.nextInt();
//				sum+=n;
			}catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�.�ٽ� �Է��ϼ���!");
				scanner.next();
//				n=0;
				i--;
				continue;
			}
			sum+=n;
			
		}
		System.out.println("����"+sum);
	}
}
