package bitmasks;

public class Bitmasks {

	public static void main(String[] args) {
		int mask1 = '\u0030';	// DECIMAL TO ASCII
		int mask2 = '\u00CF';   // ASCII TO DECIMAL
		int ascii_value = 48; 	// Set ascii value to convert to decimal
		int	decimal_from_ascii_value = ascii_value & mask2;
		int decimal_value = 7;	// Set decimal value to convert to ascii
		int ascii_from_decimal_value = decimal_value | mask1;
		System.out.printf("Ascii to Decimal >> %d \n", decimal_from_ascii_value);
		System.out.printf("Decimal to Ascii >> %d", ascii_from_decimal_value);
	
	}

}
