package basicPrograms;

public class CodeSnippets {
	public static void main (String []args){
	int a = 25;
	int b = 2;
	int c = a/b;
	System.out.println(c);// result is integer 12 when an operation is performed on 2 integers irrespective where we store the result: truncation or roundoff happens.
	
	
	byte d = 45;
	double  e ;
	e = d;
	System.out.println(e);
	// d = e; CE since double cannot be stored in byte DT
	// To solve this:
	d = (byte) e;
	System.out.println(d);// Loss of precision
	
	byte ab = 10;
	byte ac = 20;
	//byte result = ab*ac; CE
	// To solve this:
	byte result = (byte) (ab*ac);
	//int result = ab*ac;
	System.out.println(result); //operations will store result as int & int cannot be stored in byte DT
	// To understand how 200 becomes -56, consider the following:
	//200 in binary (as a 32-bit integer) is 00000000 00000000 00000000 11001000.
	//When this value is cast to byte, only the least significant 8 bits are kept: 11001000.
	//The binary 11001000 corresponds to -56 in decimal, using two's complement notation (the standard representation for signed integers in Java).


	}
}
