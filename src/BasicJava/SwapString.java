package BasicJava;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping Strings");
		System.out.println("The value of a equals::"+a);
		System.out.println("The value of b equals::"+b);
		
		a = a+b;
		System.out.println(a);
		System.out.println("**********");
		
		b = a.substring(0, a.length()-b.length());//hello
		a = a.substring(b.length());//world
		
		System.out.println("After swapping Strings");
		System.out.println("The value of a equals::"+a);
		System.out.println("The value of b equals::"+b);
		
		
		
		
	}

}
