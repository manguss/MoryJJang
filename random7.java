

import java.util.Random;

public class random7 {
public static void main(String[] args) {
	
	int [] array = new int[7];
	System.out.println("��� 7���� �Է��ϼ���: ");
	for (int i = 0; i < array.length; i++) {

	
		array[i] = (int)(Math.random()*10)+1;
	
		System.out.println(array[i]);
	}
	
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
		
		if(min > array[i]) {
			min = array[i];
			

		}
		

	
	
	
		}
		System.out.println("���� ���� ����"+min+"�Դϴ�.");
}
}
