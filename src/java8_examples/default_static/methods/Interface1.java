package java8_examples.default_static.methods;

public interface Interface1 {

	static void getStaticMethod() {
		System.out.println("Interface1 static method");
	}
	 default void geDefaultMethod() {
		System.out.println("Interface1 default method");
	}
}
