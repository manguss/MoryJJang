import java.util.Scanner;

public class Computerinterest {
public static void main(String[] args) {
	int principal;
	double rate;
	double balance;
	int years=0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ �Է��ϼ���: ");
	principal = scanner.nextInt();
	System.out.println("�������� �Է��ϼ���: ");
	rate = scanner.nextDouble();
	
	balance=principal;
	System.out.println("\n������\t������: ");

	do {
		years++;
		balance = balance * (1.0 + rate / 100.0);
		System.out.println(years+"\t"+balance);
	} while(balance <= principal *2.0);
	System.out.println("\n�ʿ��� ������= "+years);
	scanner.close();
}
}