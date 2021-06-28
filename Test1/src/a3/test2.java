package a3;

public class test2 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x + b + d);
		} catch (NumberFormatException e) {
			System.out.println("baad");
		}
	}
}
class A {
	public A() throws RuntimeException {
		System.out.println("A");
		throw new RuntimeException();
	}
	public static void abc() {
		throw new RuntimeException();
	}
}
class B extends A {
	public B() throws RuntimeException {
		System.out.println("B");
	}
}
