package BasicJava;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String s = "做饭起床上学电视跑步足球 latin string 01234567890";
		String s1 = "$$$%$£$@£$$ testing @@*&^%$£@@@! SELENIUM !@£$^£$£@ &&&&&& java";
	     s = s.replaceAll("[^a-zA-Z0-9]", "");
	     System.out.println(s);
	     
	     s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
	     System.out.println(s1);
	     
	     // remember string is immutable 
	     //^ this called not
	     //use replaceAll
	     // "[a-zA-Z0-9]"this is regular expression
	     

	}

}
