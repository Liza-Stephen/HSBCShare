
public class BitsMain {

	public static void main(String args[]) {
		int x = 35;
		int y = 45;

		System.out.println("AND Operation");
		int z = x & y;
		printBits(x);
		printBits(y);
		printBits(z);

		System.out.println("OR Operation");
		z = x | y;
		
		printBits(x);
		printBits(y);
		printBits(z);

		System.out.println("Left Shift ");
		z = x << 2;
		
		printBits(x);
		printBits(z);

		System.out.println("Right Shift");
		z = x >> 2;
		
		printBits(x);

		printBits(z);

	}

	static void printBits(int number) {

		String bitString = Integer.toBinaryString(number);
		bitString = "00000000000000000000000000000" + bitString;
		int start = bitString.length() - 32;

		bitString = bitString.substring(start);

		System.out.println(bitString + "\t" + number);
	}

}
