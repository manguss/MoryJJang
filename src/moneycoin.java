import java.util.Scanner;

public class moneycoin {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("금액을 입력하시오: ");
	
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
		System.out.println("오만원권"+ fh+"매");
	} else
		if(hh > 0) {
			System.out.println("만원권"+ hh+"매");
		}else
			
			if(th >0) {
				System.out.println("천원권"+ th+"매");
			}
				
			}
		}
	
	


