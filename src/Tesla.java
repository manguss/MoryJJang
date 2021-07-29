import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("매수 수량을 입력하시오: ");
		int tesla = 520;
		int res;
		int money;
		int num;
		num = scanner.nextInt();
		money = tesla * num;
		
		res = money / 100;
		money = money %100;
		if(res > 0) {
			System.out.println("100달러짜리"+res+"매");
		}
		res = money /10;
		if(res > 0) {
			System.out.println("10달러짜리"+res+"매");
		}
	}
}
