package basics;

public class Demo {
	public static void main(String[] args) {
		System.out.println("hello");
		Demo2.m2();
		Demo3.m3();
	}
}

class Demo2 {
	public static void m2() {
		System.out.println("m1 from Demo2");
	}
}

class Demo3{
	public static void m3() {
		System.out.println("m3 from Demo3");
	}
}
