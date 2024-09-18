package basicPrograms;

public class NumericDTEx1 {
	public static void main(String[] args) {
		
		System.out.println("-------------Whole Numbers--------------");

		System.out.println("Size of byte is :"+Byte.SIZE);
		System.out.println("MinValue of byte is :"+Byte.MIN_VALUE);
		System.out.println("MaxValue of byte is :"+Byte.MAX_VALUE);
		byte a = 10;
		byte e = 127;
//		byte r =a+e;  //int cannot be stored in byte!!
	
//		System.out.println(r);
		
		System.out.println("Size of int is :"+Integer.SIZE);
		System.out.println("MinValue of int is :"+Integer.MIN_VALUE);
		System.out.println("MaxValue of int is :"+Integer.MAX_VALUE);

		int w=a;    //byte can be stored in int 
		System.out.println(w);
		
		
//point to remember: operation on byte values will result in a int value	
		
		System.out.println("-------------Real Numbers--------------");

		//Real Numbers
		
		System.out.println("Size of float is :"+Float.SIZE);
		System.out.println("MinValue of float is :"+Float.MIN_VALUE);
		System.out.println("MaxValue of float is :"+Float.MAX_VALUE);
		
		// float b = 10.5; CE bcz by default compiler treats it as 'double'
		float b = 10.5F;
		
		System.out.println("Size of double is :"+Double.SIZE);
		System.out.println("MinValue of double is :"+Double.MIN_VALUE);
		System.out.println("MaxValue of double is :"+Double.MAX_VALUE);
		
		//byte>short>int>long>float>double
		//-----whole no.-----/---Real no.----
		
	}

}
