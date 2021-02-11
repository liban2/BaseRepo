package BasicJava;

public class SwapInteger {

	public static void main(String[] args) {
		
		//this is using third variable
		int a = 5;
		int b = 10;
		
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("**************");
		
		//using without third variable
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("**********");
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
