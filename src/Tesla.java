import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ż� ������ �Է��Ͻÿ�: ");
		int tesla = 520;
		int res;
		int money;
		int num;
		num = scanner.nextInt();
		money = tesla * num;
		
		res = money / 100;
		money = money %100;
		if(res > 0) {
			System.out.println("100�޷�¥��"+res+"��");
		}
		res = money /10;
		if(res > 0) {
			System.out.println("10�޷�¥��"+res+"��");
		}
	}
}
