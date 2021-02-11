package BasicJava;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		
		//String s = "nabil";
		
//		int len = s.length();
//		String rev = "";
//		
//		for(int i = len-1; i>=0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
//		
//		StringBuffer sf = new StringBuffer(s);
//		System.out.println(sf.reverse());
//		
//		System.out.println("********************");
//		
//		String a = "Mohamed";
//		
//		int leng = a.length();
//		 String rev1 = "";
//		
//		for(int l = leng-1; l>=0; l--) {
//			rev1 = rev1 + a.charAt(l);
//		}
//		System.out.println(rev1);
//		
		//StringBuffer kp = new StringBuffer(a);
		//System.out.println(kp.reverse());
		
		
		
		
		
//		String s = "Nacirema";
//		
//		int naya = s.length();
//		String rev = "";
//		for(int q = naya-1;q>=0;q--) {
//			rev = rev + s.charAt(q);
//		}
//		System.out.println(rev);
//		System.out.println("*********");
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
//		
			
		
//		String s = "@@£££@@£@££@££@ liban abdikafi @@££££@££";
//		
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
//				
		
//		int num = 16764785;
//		int rev = 0;
//		
//		while(num !=0) {
//			rev = rev * 10 + num % 10;
//			num = num /10;
//		}
//		System.out.println(rev);
//		
//		int num1 = 16764785;
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
//		
		
//		String s = "Malik"; //fail
//	
//		int len = s.length();
//		String rev = "";
//		for(int i=len-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
//		
		
		
//		String s = "@@££@£$@$£%£$ Liban your almost there &*&%$^$%$%£";//Fail
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
//		
//		int num = 12345;//fail
//		int rev = 0;
//		
//		while(num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println("this is my reverse value::"+rev);
//		
		
//		
//		String s = "liban";
//		int len = s.length();
//		
//		String rev = "";
//		
//		for(int i = len-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}
//		
//		System.out.println(rev);
//		
		
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
//		

//		String c = "liban";
//		String c1 = "zakariya"; 
//		
//		int a = 230;
//		int a1 = 270;
//		
//		
//		System.out.println(c+c1+a+a1);//seperated
//		System.out.println(c+c1+(a+a1));//added
//		
////		
//		int i = 0;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		for(int a =0;a<=25;a++) {
//			System.out.println(a);
//		}
		
		
//		int a[] = new int[4];
//		
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		String q = "mohamed";  intialise string
//		int leng = q.length(); then store the length in vairable
//		
//		String reve = "";       then create storage for the reversed variable
//		
//		for(int i = leng-1;i>=0;i--) {//remember its greater  
//			reve = reve + q.charAt(i); remember chart method
//		}
//		System.out.println(reve);
//		
//		
//		String s = "@£@£$$£$$%$£@ liban you can do it &**^&^^$%$£@$@";
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
//		
////		
//		int num = 5984321;
//		int rev = 0;
//		
//		while(num !=0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		
//		System.out.println(rev);
//		
		
//		int a[] = {1,2,3,4,5,7,8,9,10};
//		
//		int sum = 0;
//		for(int i = 0;i<a.length;i++) {
//			sum =sum + a[i];
//		}
//		System.out.println(sum);
//		
//		int sum1 = 0;
//		for(int q = 1;q<=10;q++) {
//			sum1 =sum1 + q;
//		}
//		System.out.println(sum1);
//		
//		System.out.println(sum1-sum);
//		
//		
		
//		int a[] = {1,2,3,4,5,6,7,9,10};
//		
//		int sum = 0;
//		
//		for(int i = 0;i<a.length;i++) {
//			sum = sum + a[i];
//		}
//		System.out.println(sum);
//		
//		int sum1 = 0;
//		for(int j = 1;j<=10;j++) {
//			sum1 = sum1 + j;
//		}
//		System.out.println(sum1);
//		
//		System.out.println(sum1-sum);
//		
//		
//		int numbers[] = {-35,2837,34,772,-19,200};
//		
//		int largest = numbers[0];
//		int smallest = numbers[0];
//		
//		for(int i=1;i<numbers.length;i++) {
//			if(numbers[i]>largest) {
//				largest = numbers[i];
//			}
//			else if(numbers[i]<smallest) {
//				smallest = numbers[i];
//			}
//		}
//		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(largest);
//		System.out.println(smallest);
//		
//		
//		
//		
//		String a = "hello";
//		String b = "world";
//		
//		a = a+b;
//		
//		b = a.substring(0, a.length()-b.length());
//		
//		a = a.substring(b.length());
//		
		
//		int x = 5;
//		int y = 10;
//		
//		int t;
//		
//		t=x;
//		x=y;
//		y=t;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println("************");
//		
//		x = x + y;//15
//		y = x - y;//5
//		x = x - y;//10
//		
//		System.out.println(x);
//		System.out.println(y);
//		
//		
//		int num = 654321;
//		int rev = 0;
//		
//		while(num !=0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		
//		
//		System.out.println(rev);
//		
	
//		int a[] = {1,2,3,4,6,7,8,9,10};
//		
//		int sum = 0;
//		
//		for(int i=0;i<a.length;i++) {
//			sum = sum + a[i];
//		}
//		
//		int sum1 = 0;
//		
//		for(int j = 1;j <= 10;j ++) {
//			sum1 = sum1 + j;
//		}
//		System.out.println(sum1 - sum);
//		
		
	int num = 654321;
	int rev = 0;
	
	while(num !=0) {
		rev = rev * 10 + num % 10;
		num = num / 10;
	}
	System.out.println(rev);
		
		
		
		
		
		
		
		
	}
	
	


}
