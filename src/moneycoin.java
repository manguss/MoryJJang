import java.util.Scanner;

public class moneycoin {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("�ݾ��� �Է��Ͻÿ�: ");
	
	int money;
	money= scanner.nextInt();
	
	int fh = money%50000;
	int hh = (money - fh)%10000;
	int th = (money - fh - hh)%1000;
	int h = (money - fh - hh- th)%100;
	int f =  (money - fh - hh- th - h)%50;
	int t = (money - fh - hh- th - h - f)%10;
	int o = (money - fh - hh- th - h - f - t)%1;
	
	if(fh > 0) {
		System.out.println("��������"+ fh+"��");
	} else
		if(hh > 0) {
			System.out.println("������"+ hh+"��");
		}else
			
			if(th >0) {
				System.out.println("õ����"+ th+"��");
			}
				
			}
		}
	
	


