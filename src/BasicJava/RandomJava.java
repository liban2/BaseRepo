package BasicJava;

public class RandomJava {
	
	 String name;
	 int age;
	 String job;
	
	public RandomJava(String name1, int age1, String job1) {
		name = name1;
		age = age1;
		job = job1;
	}
	

	public static void main(String[] args) {
		
		
	
		int lee[][] = new int[4][7];
		
		lee[0][0] = 100;
		lee[0][1] = 200;
		lee[0][2] = 300;
		lee[0][3] = 400;
		lee[0][4] = 500;
		lee[0][5] = 600;
		lee[0][6] = 700;
		
		lee[1][0] = 110;
		lee[1][1] = 210;
		lee[1][2] = 310;
		lee[1][3] = 410;
		lee[1][4] = 510;
		lee[1][5] = 610;
		lee[1][6] = 710;
		
		lee[2][0] = 120;
		lee[2][1] = 220;
		lee[2][2] = 320;
		lee[2][3] = 420;
		lee[2][4] = 520;
		lee[2][5] = 620;
		lee[2][6] = 720;
		
		lee[3][0] = 130;
		lee[3][1] = 230;
		lee[3][2] = 330;
		lee[3][3] = 430;
		lee[3][4] = 530;
		lee[3][5] = 630;
		lee[3][6] = 730;
		
		
		
		
		System.out.println(lee.length);
		System.out.println(lee[3][3]+lee[0][2]);
		System.out.println("**************");
		for(int i=0;i<lee.length;i++) {
			for(int j=0;j<lee[0].length;j++) {
				System.out.println(lee[i][j]);
			}
		}
		System.out.println("**********");
		
		String d[] = new String[5];
		
		d[0] = "where";
		d[1] = "there";
		d[2] = "here";
		d[3] = "now";
		d[4] = "then";
		
		System.out.println(d.length);
		for(String str :d) {
			System.out.println("this is advanced for loop::"+str);
		}
		
	    String s = "true";
	    String s1 = "false";
	    boolean b = Boolean.parseBoolean(s);
	    boolean b1 = Boolean.parseBoolean(s1);
	    
	    System.out.println(b1);
	    
	    int q = 3200;
	    String e =String.valueOf(q);
	    System.out.println(e+20);
	    
	    RandomJava r = new RandomJava("liban", 36,"engineer");
	    RandomJava r1 = new RandomJava("mohamed",10,"great son");
	    RandomJava r2 = new RandomJava("riyana",14,"great daughter");
	    
	    System.out.println(r.name+" "+r1.age+" "+r2.job);
		
        
	}

}
