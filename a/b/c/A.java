package a.b.c;

public class A implements SuperHero {
	
	public void m1() {
		int aaa = 1;
		int b = 2;

		int c = aaa + b;

		print(c);
	}

	public void print(int c) {
		System.out.println(c);
	}

	public void supersuper() {
		System.out.println("I believe I can fly");
	}

}