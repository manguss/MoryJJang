import java.util.Scanner;

public class Alphabat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�: ");
		String s= scanner.next();
		char c = s.charAt(0);
		
		for(char i = c; i >= 'a'; i--) {
			for (char j = 'a';  j <= i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		scanner.close();
	}
}