import java.util.Scanner;

public class numberex {
	public static void main(String[] args) {

		boolean multiple;
		int number;
		
		Scanner scanner =new Scanner(System.in);
		multiple=false;
		number = scanner.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3의 배수이다.");
		}
		if(number % 5 == 0) {
			System.out.println("5의 배수이다.");
			
		}
		if(number % 8 == 0) {
			System.out.println("8의 배수이다.");
		}
		if(!multiple) {
			System.out.println("어느 배수도 아니다.");
			
		}
	}
}