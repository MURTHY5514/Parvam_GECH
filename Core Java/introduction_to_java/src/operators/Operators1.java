package operators;

public class Operators1 {
	/*
	 *	Operators: 
	 *============
	 *1. Arthameitc - +, - , *, /, %
	 *2. assignment - +=, -=, *=, /=, %=, =
	 *3. Logical - &&, ||, !
	 *4. Bit wise - &, |, ~
	 *5. Relational - <, >, <=,  >=, !=, ==  --> boolean
	 *6. Unary - ++, --
	 *7. swift  - >>,<<.
	 */
	
	
	public static void main(String[] args) {
		//1. Arithmetic operators:
		//========================
		int num1 = 10;
		int num2 = 2;
		
		System.out.println("Arithmetic operators:");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		System.out.println(num1+" % "+num2+" = "+(num1%num2));
		
		//2. Assignment
		int num3 = 10;
		int num4 = 0;
		num4+=num3; // num4 = num4 + num3  
		//num4 = 0 + 10--> num4 = 10
		System.out.println("Num4 = "+num4);
		int num5 = 0;
		num5-=num3; // num5 = num5 - num3 --> 0-10 --> -10
		System.out.println("Num5 = "+num5);
		
		//Logical
		
		System.out.println("Logical Operators:");
		/*
		 * 				False 		Truth
		 * a. byte        0           >0
		 * b. short       0
		 * c. int         0
		 * d. long        0
		 * e. float       0.0f
		 * f. double      0.0
		 * g. char        ''           'a'
		 * h. boolean     false        true 
		 */
		boolean var1 = true;
		boolean var2 = false;
		System.out.println("and of var1 and var2 : "+(var1 && var2));
		System.out.println("or of var1 and var2 : "+(var1 || var2));
		System.out.println("not of var2 : "+(!var2));
		
		//Unary
		System.out.println("Unary Operators: ");
		int var3 = 10;
		var3++; // post increment  --> var3 = var3 + 1;
		var3--; // post decrement  --> var3 = var3 - 1;
		System.out.println("Value of var3: "+var3);
		
		//Bitwise
		System.out.println("Bit wise:");
		// 2^5   2^4    2^3    2^2   2^1   2^0
		// 32      16      8      4     2    1
		// 0        0       1      0      1    0
		//1010                            0
		
		int var4 = 5;  // 0101  32bit
		int var5 = 3;  // 0011
		              //& 0001
					  //| 0111
		System.out.println(var4+" & "+var5+" = "+(var4&var5));
		System.out.println(var4+" | "+var5+" = "+(var4|var5));
		
		int var6 = 5;
		/*
		 *  5 in 32 bit
		 *  ===========
		 *  00000000 00000000 00000000 00000101
		 *  ~5
		 *  11111111 11111111 11111111 11111010
		 *  1's 
		 *  00000000 00000000 00000000 00000101
		 *  2's							  1
		 *  00000000 00000000 00000000 00000110 --> -6
		 */
		System.out.println(var6+" ~ "+(~var6));
		
		//shift --> >>,<<
		
		int var7 = 10; // 00001010
		int var8 = var7 << 1;  // 00010100
		
		System.out.println(var7+ " << "+var8);
	}
	
}
