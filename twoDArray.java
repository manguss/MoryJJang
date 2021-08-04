

import java.util.Random;

public class twoDArray {
public static void main(String[] args) {
	int a = 4;
	int [][] arr = new int[4][4];
	
	for(int i = 0; i < a; i++) {
		for(int j =0; j <a; j++) {
	arr[i][j]=(int)(Math.random()*10+1);

	}
	}
	
for(int i = 0; i < a; i++) {
	for(int j =0; j <a; j++) {
		System.out.print(arr[i][j]+"\t");
}
System.out.println();

}

}
}
