package oops;

public final record Student(String name, String email) {

}

class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("sai surya", "sai@email.com");

		System.out.println(student.name());
		System.out.println(student.email());

	}

}
