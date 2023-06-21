package java8_examples.default_static.methods;

public class TestDefaultMethod implements Interface1,Interface2{

	public static void main(String[] args) {
		TestDefaultMethod method= new TestDefaultMethod();
		method.geDefaultMethod();
	}

	@Override
	public void geDefaultMethod() {
		// TODO Auto-generated method stub
		Interface2.super.geDefaultMethod();
		System.out.println("hello");
	}
}
