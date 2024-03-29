package com.testingfly.lc;

/*
 * Example 1:

Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
Example 2:

Input: 11111111111111111111111111111101
Output: 10111111111111111111111111111111
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10101111110010110010011101101001.
 

Note:

Note that in some languages such as Java, there is no unsigned integer type. In this case, both input and output will be given as signed integer type and should not affect your implementation, as the internal binary representation of the integer is the same whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 */
public class ReverseBits {

	public static void main(String[] args) {
		
		System.out.println(reverseBits(7));

	}

	/*
	 * Perform left shit of rev until the 32nd element
	 * if(n & 1==1), ^ it to rev;
	 * Note: rev<<1 needs to be done ahead of teh ^ operation to avoid trailing 0s.
	 */
	public static int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++){
            rev = rev<<1;
            if((n & 1)==1)
                rev = rev ^ 1;
            n = n>>1;
        }
        return rev;
    }
}
