import java.util.Scanner;

public class Computerinterest {
public static void main(String[] args) {
	int principal;
	double rate;
	double balance;
	int years=0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("원금을 입력하세요: ");
	principal = scanner.nextInt();
	System.out.println("연이율을 입력하세요: ");
	rate = scanner.nextDouble();
	
	balance=principal;
	System.out.println("\n연도수\t원리금: ");

	do {
		years++;
		balance = balance * (1.0 + rate / 100.0);
		System.out.println(years+"\t"+balance);
	} while(balance <= principal *2.0);
	System.out.println("\n필요한 연도수= "+years);
	scanner.close();
}
}