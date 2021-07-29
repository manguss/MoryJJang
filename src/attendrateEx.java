import java.util.Scanner;

public class attendrateEx {
	public static void main(String[] args) {
		
		boolean cheating;
		int att;
		int total;
		char grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("부정행위 여부(true 혹은 false): ");
		cheating = scanner.nextBoolean();
		
		System.out.println("출석률(0~100사이의 정수값): ");
		att = scanner.nextInt();
		
		System.out.println("총점(0~100사이의 정수값): ");
		total = scanner.nextInt();
		
		
		if(cheating) {
			grade = 'F';
		}else if (att < 80) {
			grade = 'F';
		}else {
			if (total >= 90) {
				grade = 'A';
			}else if (total >=80) {
				grade = 'B';
			}else if (total >= 70) {
				grade = 'C';
			}else if (total >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
		
			}
		
			
		}
		System.out.println("학점= "+grade);
		
		
	}
}
