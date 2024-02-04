

class BitwiseOperator{

	public static void main(String[] args){
	
		byte num1 = 5;
		byte num2 = 3;

		System.out.println(num1 & num2); // 0000 0001
		System.out.println(num1| num2);  // 0000 0111
		System.out.println(num1 ^ num2); // 0000 0110
		System.out.println(num1<<1); // 0000 0101 -->    0000 1010
		System.out.println(num1>>1);//  0000 0101 -->    0000 0010
	}
}
