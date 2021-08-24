package ex7no27;

class A {
	public void methodA( B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class ex7no27 {  //  396p
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}

}
