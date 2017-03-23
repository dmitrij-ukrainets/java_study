import java.math.RoundingMode;

public class CastingNumericalValuesClass {
	public static void main(String[] args) {
		byte byteVal = 11;
		short shortVal = 112;
		int intVal = 221;
		long longVal = 358493689;
		float floatVal = 135.546f;
		double doubleVal = 15833.58436;
		
		//System.out.println(Short.MAX_VALUE);
		
		byteVal = (byte)shortVal;
		System.out.println(byteVal);
		
		intVal = shortVal;
		System.out.println(intVal);
		
		int intVal1;
		intVal1 = (int)135.5646;
		System.out.println(intVal1);
				

	}
}
