package oops;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book(122, "Thinking in Java", "Eckel");
		Book b2 = new Book(133, "Java Ref", "H Shield");
		Book b3 = new Book(144, "Mater Python", "Carl Ivan");

		System.out.println("Total Books : " + Book.showCount());
		b1.showBook();
		b2.showBook();
		b3.showBook();
	}

}
