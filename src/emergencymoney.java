import java.util.Scanner;

public class emergencymoney {
	public static void main(String[] args) {
		
		int h = 120000;
		int t = 12000;
		int res, money = 0, num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �Է��Ͻÿ�: ");
		num = scanner.nextInt();
		
		
		
		if(num == 1) {
			money = 400000;
		}else
		if(num == 2) {
			money = 600000;
		
			
		}
		else if(num == 3) {
			money = 800000;	
	}
		else if(num == 4) {
			money = 1000000;

		}
	
		res = money / h;
		money = money % h;
		if (res >0 ) {
			System.out.println("100�޷�¥��"+res+"��");
		}
		res = money / t;
		if (res > 0) {
			System.out.println("10�޷�¥��"+res+"��");
		}
}
}