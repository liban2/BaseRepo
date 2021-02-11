package BasicJava;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "liban InshAllah you will be successful";
		String str1 = "liban inshAllah you will be successful";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf('a'));//first occurrence of a 
		
		System.out.println(str.indexOf('a',str.indexOf('a')+1));//second occurrence of a 
		
		System.out.println(str.indexOf("you"));
		
		System.out.println(str.indexOf("showtime"));//anything not in the index will come up as -1
		System.out.println("***************");
		
		//String comparison
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(0, 28));
		
		//trim method
		String s = "    Allah is AL Rizq    ";
		
		System.out.println(s.trim());
		
		//replace method
		System.out.println(s.replace(" ",""));
		
		String date = "31-12-1984";
		
		System.out.println(date.replace("-", "/"));
		System.out.println("*************");
		
		//split method
		String sp = "liban_this_is_light_work";
		
		String change[] = sp.split("_");
		
		for(int i=0;i<change.length;i++) {
			
			System.out.println(change[i]);
		}
		System.out.println("***************");
		
		String lee = "liba";
		System.out.println(lee.concat("n"));
		
		System.out.println("***************");
		
		String s2 ="hello";
		String d = "world";
		
		int t = 73;
		int h = 127;
		
		System.out.println(s2+d);//helloworld
		System.out.println(t+h);//200
		System.out.println(t+h+s2+d);//200helloworld
		System.out.println(s2+d+t+h);//helloworld73127
		System.out.println(s2+d+(t+h));//helloworld200
		
		
		
		
		
		
		
	}

}
