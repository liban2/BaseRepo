package BasicJava;

public class ReverseInteger {

	public static void main(String[] args) {
		
//		
//		String l = "nabil";
//		
//		int len = l.length();
//		
//		String rev = "";
//		
//		for(int i = len-1;i >= 0;i --) {
//			rev = rev + l.charAt(i);
//		}
		//System.out.println(rev);
		System.out.println("************");
		
		int num = 654321;
		
		int rev = 0;
		
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
	
	}

}
