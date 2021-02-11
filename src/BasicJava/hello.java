package BasicJava;

public class hello {
	
	boolean salaam;
	boolean hey;

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int myFirstNumber = (10 + 5) + (2 * 10);
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		int myLastOne = 1000;
		int myTotal = myFirstNumber + mySecondNumber +  myThirdNumber - myLastOne;
		System.out.println(myTotal);
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		int b = 100;
		
		System.out.println("the value of a is =" +b);
		//comparison operaters(<,>,<=,>=,!=)
		//condition statement
		int a1 = 19;
		int b1 = 100;
		int c1 = 14;
		
		if(a1>b1 & a1>c1) {
			System.out.println("malik  is older");
		}
		else if(b1>c1) {
			System.out.println("mohamed is older");
		}
		else {
			System.out.println("riyana is older and has no sense");
		}
		
		//while loop disadvantage is it will generate infinite loop if you dont give it incremental or decremental part
		int a=3; //Initialisation 
		while(a<=33) { //condition
			System.out.println(a+"this is my while loop");
			a++;//increment
		}
		System.out.println("*******************************");
		for(int l=12;l>=-12;l--) {
			System.out.println(l);
		}
		System.out.println("****************************");
		
		//post increment
		int p = 2;
		int q = p++;
		System.out.println(p);//3
		System.out.println(q);//2
		
		//pre increment
		int s = 10;
		int w = ++s;
		System.out.println(s);//11
		System.out.println(w);//11
		
		//post decrement 
		int e = 7;
		int t = e--;
		System.out.println(e);//6
		System.out.println(t);//7
		
		//pre decrement
		int u = 43;
		int o = --u;
		System.out.println(u);//42
		System.out.println(o);//42
		System.out.println("*****************************");
		//array is to store a similar data type values in a array variable
		//lowest bound/index = 0
		//upper bound/index = n-1(n is size of array)
		//This is called one dimensional array
		//Dis-advantage size is fixed - static array- to resolve this problem we us Dynamic array-- collections-- hashtable, arraylist
		//Only stores similar data type to resolve this we use object array(object is class).
		int lee[] = new int[4];
		lee[0] = 10;
		lee[1] = 20;
		lee[2] = 30;
		lee[3] = 40;
		
		System.out.println(lee[1]);
		System.out.println(lee.length);
		
		for(int kay=0;kay<lee.length;kay++) {
			System.out.println(lee[kay]);
		}
		System.out.println("**********************************");
		//object array(object is a class) it is used to store different data type values
		Object ob[] = new Object [4];
		ob[0] ="liban";
		ob[1] = 'h';
		ob[2] = 8909;
		ob[3] = "31/12/84";
		
		System.out.println(ob[3]);
		System.out.println(ob[2]);
		System.out.println(ob.length);
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		System.out.println("********************");
		//2D array index are based on rows and columns use of cells
		int v[][] = new int[3][4];
		System.out.println(v.length);//row = v.length
		System.out.println(v[0].length);//column = v[0].length
		
		v[0][0] = 100;
		v[0][1] = 200;
		v[0][2] = 300;
		v[0][3] = 400;
		
		v[1][0] = 101;
		v[1][1] = 201;
		v[1][2] = 301;
		v[1][3] = 401;
		
		v[2][0] = 102;
		v[2][1] = 202;
		v[2][2] = 302;
		v[2][3] = 402;
		
		for(int row=0;row<v.length;row++) {
			for(int col=0;col<v[0].length;col++) {
				System.out.println(v[row][col]);
			}
		}
		
		System.out.println("*******************");
		//new hello(); -- is the object of hello class 
		//new is a keyword used to create object of class
		//liban,kay,riri -- are the object reference variables
		hello liban = new hello();
		hello kay = new hello();
		hello riri = new hello();
		
		liban.hey = false;
		liban.salaam = true;
		
		kay.hey = true;
		kay.salaam = false;
		
		riri.hey = false;
		riri.salaam = true;
		
		System.out.println(liban.salaam);
		System.out.println(kay.hey);
		System.out.println(riri.hey);
		
		System.out.println("******************"); 
		//when creating object it should be within the main method
		//use the object reference variable to call on the non static methods
		//if i wish to call non static method i have to create the object
		//main method is always void because we never write a return statement in it (never return a value)
		hello fam = new hello();
		
		fam.liban();
		
		String s1 = fam.kay();
		System.out.println(s1);
		
		int mill = fam.riyana(40, 50, 2);
		System.out.println(mill);
		
		

	}
	//void does not return any values
	//return type void
	//no input no output
	public void liban(){
		System.out.println("InshAllah you will succeed");
	}
	// return type String
	// no input some output be cause of returning String
	public String kay() {
		System.out.println("InshAllah she will find the haqq");
		String q = "Rahma";
		String w = "Rizq";
		String e = (w)+(q);
		
		return e;
	}
	//a,b,c ---> input parameter/arguments
	public int riyana(int a, int b, int c) {
		System.out.println("InshAllah you will continue to make me proud");
		int x = (a+b)/c;
		
		return x;
	}
	
	//global/local variable
	//the scope of global variables will be available across all the functions/methods with some conditions such as static and non static 
	// in order to access or call on global/class variables you have to create class object within main method
	//you can also call on non static methods with your class object
	// local variables can be called directly within their own methods
	
	//method overloading
	//method overloading is when you create same method name with different number of parameters/arguments or different datatype
	//can you overload main method yes same rules apply however overloading main method is not needed
	//and you can only call non static methods
	//you can never have a method within a method
	
	//method overriding 
	//is when when there is the same method with same parameters but in different classes as supposed to method overloading where its
	//--- in the same class with different arguments
	//Compile Time Polymorphism/static polymorphise makes the decision of which method is to be called is made at the time of compilation java will
	// remeber in inheritance a child class can inherit from parent class but a parent cannot inherit from child class
	//gives you access to their non overridden methods for child class
	
	
	//Static&Non Static
	//how to call static global variable and static method is simple calling it directly e.g 
	//static int age = 25; call it by system.out.println(age) or using class name e.g system.out.println(staticAndNonStatic.age)
	//public static void sum(){ call it by sum(); or staticAndNonStatic.sum();
	
	//how to call non static global variable and non static method is simple calling after creating class object e.g
	//staticAndNonStatic obj = new staticAndNonStatic();
	//then you will call the non static method by obj reference e.g obj.sendmail(); 
	//system.out.println(obj.name);
	
	//can i access a static method using object reference? yes but you will get a warning and its not best practice
	
	//dynamic polymorphism/runtime polymorphism
	//for example this is when you combine parent class reference variable with object of child class
	// this is called top casting
	// Car c1 = new BMW(){	
	//only common methods/overridden methods will be called aswell as parent class methods always giving preference to
	//-- child class overridden method
	//down casting 
	// is when parent class object is referred by child class reference variable
	//child c = (child)new parent(); if casted it will show no error however it will show ClassCastException
	// at the runtime it will give you an Exception causing java confusion
	
	
	
	
	
	

}
