package basicPrograms;

public class charDT {

	public static void main(String[] args) {
		char x = 'A'; //Valid
		//char y = "A"; CE 
		//char y = 'AB'; CE
		 
		byte a = 4;
		double b = 5.5;
		//a = b;CE: float cannot be converted to byte
		b=a;//valid: but precision lost
		System.out.println(b);
		
		byte c;
		double d = 10.5;
		c = (byte) d;// to make a = b possible
		System.out.println(c);
		
		byte ab = 10;
		byte ac = 20;
		//byte result = ab*ac; System.out.println (result); CE as by default result is an int and int cannot be stored in byte
		byte result = (byte) (ab*ac) ;
		System.out.println(result);
		System.out.println(ab*ac);
		
		
		byte xi=127;
		byte yi=1;
		byte res1=(byte)(xi+yi);
		System.out.println(res1);
	
	}

}
