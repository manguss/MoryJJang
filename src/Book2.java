
public class Book2 {

	String title;
	String author;
	void show() 
		{System.out.println(title + " "+author);}
		public Book2() {
			this("", "");
			System.out.println("생성자 호출됨");
			
		}
		public Book2(String title) {
			this(title,"작자미상");
			System.out.println("생성자 호출됨2");
		}
		
		
		 
		public Book2(String title, String author) {
			this.title=title; this.author=author;
			System.out.println("생성자 호출됨3");
			
		}
		public static void main(String[] args) {
			Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
			littlePrince.show();
			
			Book2 choonhyang = new Book2("춘향전");
			choonhyang.show();
			
			Book2 emptyBook = new Book2();
			emptyBook.show();
		}
			
		
	}

