
public class Book2 {

	String title;
	String author;
	void show() 
		{System.out.println(title + " "+author);}
		public Book2() {
			this("", "");
			System.out.println("������ ȣ���");
			
		}
		public Book2(String title) {
			this(title,"���ڹ̻�");
			System.out.println("������ ȣ���2");
		}
		
		
		 
		public Book2(String title, String author) {
			this.title=title; this.author=author;
			System.out.println("������ ȣ���3");
			
		}
		public static void main(String[] args) {
			Book2 littlePrince = new Book2("�����", "�������丮");
			littlePrince.show();
			
			Book2 choonhyang = new Book2("������");
			choonhyang.show();
			
			Book2 emptyBook = new Book2();
			emptyBook.show();
		}
			
		
	}

