import java.util.Random;

public class RandomTen {
public static void main(String[] args) {
	int n[]= new int[10];
	
	for (int i = 0; i < n.length; i++) {
		n[i] = ((int)(Math.random()*10))+1;
	}
	int sum =0;
	for (int i = 0; i < n.length; i++) {
		sum += n[i];
	}

	System.out.println("������ ������ : ");
	for (int i = 0; i < n.length; i++) {
		System.out.println(n[i]+" ");
	}
		System.out.println("�����"+(double)sum/n.length);
	}

	
}

