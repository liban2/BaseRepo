package BasicJava;

public class Refresh {

	public static void main(String[] args) {
		
		//String to int conversion
		String x1 = "100";
		System.out.println(x1+20);//this will come out as 10020 as a String
		
		int l = Integer.parseInt(x1);//data conversion from String to int 
		System.out.println(l+20);
		
		//String to double conversion
		String y = "76.99";
		System.out.println(y+10);
		
		double d1 = Double.parseDouble(y);
		System.out.println(d1+10);
		
		//String to boolean conversion 
		String o = "false";
		System.out.println(o);
		
		boolean b1 = Boolean.parseBoolean(o);
		System.out.println(b1+"numbers");
		
		//int to String conversion
		int r = 200;
		System.out.println(r+20);
		
		String c = String.valueOf(r);
		System.out.println(c+20);
		
		String u = "100x";//when its not pure numerics you get NumberFormatException
		System.out.println(u);
		Integer.parseInt(u);
		
		

	}

}
