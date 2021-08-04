

class point1{
	private int x,y;
	public point1() {
		this.x=this.y=0;
	}
	public point1(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showpoint() {
		System.out.println("("+x+","+y+")");
	}
}
class colorpoint1 extends point1{
	private String color;
	public colorpoint1(int x, int y, String color) {
		super(x, y);
		this.color=color;
		
	}
	public void showColorpoint() {
		System.out.print(color);
		showpoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
	colorpoint1 cp = new colorpoint1(5,6,"blue");
	cp.showColorpoint();
	
}
}
