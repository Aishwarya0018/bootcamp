package oops;

public class Book {
	// instance fields
	int bookId;
	String name;
	String author;
	// static field
	static int count;

	public Book(int bookId, String name, String author) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		count++;
	}

	public static int showCount() {
		return count;
	}

	public void showBook() {
		System.out.println(this.bookId + "\t" + this.author + "\t" + this.name);
	}
}
