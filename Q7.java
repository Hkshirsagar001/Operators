


/* num --> |100|-->|99|
 * 
 *128 64 32 16 8 4 2 1
   0   1  1  0 0 0 1 1    
 *
 *
 * */


class C2W{

	public static void main(String[] args){
	
		int num = 100;  // 0110 0011

		num--;

		System.out.println(num << 1);// 1100 0110 --> 198

		num = num >>>1;

		num+=3;

		System.out.println(num);
		
	}
}
