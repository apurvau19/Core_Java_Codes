package basicPrograms;


public class IncreDecrementation {

//	 static int  z=15;
//	
	 public static void main(String[] args) {
		System.out.println("inside  me");
		
		int sum=add(10,20);
		int sumby2=sum/2;
		
		System.out.println(sumby2);
		
		String[] pui= {};
		undu(pui);
		
		
	}
	 
	 public static int add(int a, int b) {
		return a+b;
	 }
	
	
	public static void undu(String[] args) {
		int a = 5;
		System.out.println(a);
		//a++;
		++a;
		System.out.println(a);
		int b = 5;
		int c ;
		 c = ++b;
		System.out.println(b);
//		printMe();
		int x = 5;
		int y;
		y = x++ + x++ - x-- + ++x + x++;
		System.out.println(x);
		System.out.println(y);
		
		
		char[] str1= {'A','p','P','u','S'};
		System.out.println(str1);
		
		
		String str2="Appu is mad and sourabh is mad";
		
		
	
//		Bidi bidu = new Bidi();
//				
//		bidu.main1();
//		
	
		
		
		Bidi.main1();
		
	}
	
	
}

class Bidi{
	
	public static  void main1() {
		
		System.out.println("In class bidi, in main1()");
	}
}

