
import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	 int numberToGuess;
	 int guess;
	 
	 Random generator = new Random();
	 numberToGuess = generator.nextInt(10)+1;
	 System.out.println("������ ���ڸ� �Է��ϼ���: ");
	 guess = scanner.nextInt();
	 
	 while(guess != numberToGuess) {
		 System.out.println("������ ���ڰ� Ʋ�Ƚ��ϴ�");
		 
		 if(guess > numberToGuess) {
			 System.out.println("������ ���ڰ� �ʹ� Ů�ϴ�.");
		 }else {
	 System.out.println("������ ���ڰ� �ʹ� �۽��ϴ٤�.");
		 
		 }
		 guess = scanner.nextInt();
		 
	
	 }
	 System.out.println("���߼̽��ϴ�.");
	 scanner.close();
	
	
	
	
	
	
		
	
	
}
}
