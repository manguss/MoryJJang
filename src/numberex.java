import java.util.Scanner;

public class numberex {
	public static void main(String[] args) {

		boolean multiple;
		int number;
		
		Scanner scanner =new Scanner(System.in);
		multiple=false;
		number = scanner.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3�� ����̴�.");
		}
		if(number % 5 == 0) {
			System.out.println("5�� ����̴�.");
			
		}
		if(number % 8 == 0) {
			System.out.println("8�� ����̴�.");
		}
		if(!multiple) {
			System.out.println("��� ����� �ƴϴ�.");
			
		}
	}
}