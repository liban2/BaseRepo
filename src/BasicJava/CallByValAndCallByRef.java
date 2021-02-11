package BasicJava;

public class CallByValAndCallByRef {
	
	int p = 50;
	int q = 60;

	public static void main(String[] args) {
		//call by value is when your able to copy or pass a variable to another method whilst the first method retains its original copy
		 CallByValAndCallByRef obj = new  CallByValAndCallByRef();
		 int x = 10;// a copy of x,y have now been give to a,b
		 int y = 20;
		 int l = obj.testSum(x, y);//this is called call by value or pass by value
		 System.out.println(l);
		
		
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int testSum(int a, int b) {
		a = 30; // if this is the latest value it will take on this and c will = 70
		b = 40;
		int c = a+b;
		return c;
		
	}
	//this is call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;//temp = 50
		t.p = t.q;//t.p = 60
		t.q = temp;//t.q= 50
		
	}
	
	
	

}
