package basicPrograms;

public class Operators {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
	//Arithmetic Operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);//Gives remainder
		
	//Relational Operators
		System.out.println("a = 30 and b = 20");
		System.out.println("a>b " + (a>b));
		System.out.println("a<b " + (a<b));
		System.out.println("a<=b " + (a<=b));
		System.out.println("a>=b " + (a>=b));
		System.out.println("a==b " + (a==b));
		System.out.println("a!=b " + (a!=b));
	
	//Assignment Operator (=)
		int c, d, e, f; // applied for same datatype only
		c = d = e = f = 10;// Chained assignment
		c = d = e = f = 10+5;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(e);
		
		System.out.println("-------------");

		
		int A = 10;
		A+=20;
		System.out.println(A);
		A-=20;
		System.out.println(A);
		A*=20;
		System.out.println(A);
		A%=20;
		System.out.println(A);
		
		 //Conditional Operators
		System.out.println("-------------");
		//int a = 30;
		//int b = 20;
		
		if (a>b)
		{
			if(a%b == 0){
				System.out.println ("a is divisible by b");
			}
			else {
				System.out.println("a is indivisible by b");
			}
			System.out.println (a-b);
		}
		
		else {
			System.out.println (a+b);
		}
		
		System.out.println("------OR------");
		//int a = 30;
		//int b = 20;
		//c = 15;
		
		if (a<b && a<c){
			System.out.println("a is the least");
		}
		else if (b<a && b<c) {
			System.out.println("b is the least");
		}
			else{
				System.out.println("c is the least");
				
			}
		
		System.out.println("------------");
		//int a = 30;
		//int b = 20;
		//c = 15;
		
		if (a<b || a<c){
			System.out.println("a is the least");
		}
		else if (b<a || b<c) {
			System.out.println("b is the least");
		}
			else{
				System.out.println("c is the least");
				
			}
		
		System.out.println("------------");
		
		int num1 = 100;
		int num2 = 20;
		int num3 = 50;
		
		if(num1<num2) {
			if (num1<num3) {
				System.out.println(num1);
			}
			else if (num3<num2) {
				System.out.println(num3);
			}
			else {
				System.out.println(num2<num3);
			}
		}
		else if (num2<num3){
			System.out.println(num2);

		}
		else {
			System.out.println(num3);
		}
		
		//OR
		/*
		int num1 = 100;
		int num2 = 20;
		int num3 = 50;
		*/
		int result = (num1<num2)? (num1<num3? num1:(num3<num2? num3:num2)):(num2<num3? num2: num1);
		System.out.println(result);
		int result2 = (num1>num2)? (num1>num3? num1:(num3>num2? num3:num2)):(num2>num3? num2:num3);
		System.out.println(result2);

		System.out.println("------------");


		//Ternary Operators
		int a1 = 10;
		int b1 = 20;
		
		int c1= (a1<b1)? a1:b1;
		System.out.println(c1);
		
		int a2 = 10;
		int b2 = 20;
		int c2 = 30;
		
		int res = (a2<b2)? (a2<c2? a2:b2):(b2<c2? b2:c2);
		System.out.println(res);
		int res2 = (a2>b2)? (a2<c2? a2:b2):(b2<c2? b2:c2);
		System.out.println(res2);


		}
		
	}

