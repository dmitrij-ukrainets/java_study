
public class ArrayClass {
	public static void main(String[] args) {
		
		int value0 = 7;
		int value1 = 15;
		int value2 = 8;
		
		int[] array1;
		array1 = new int[3];
		
		array1[0] = value0;
		array1[1] = value1;
		array1[2] = value2;
		//System.out.println(values[0]);
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		int[] array2 = {18, 5, 22};
		for (int j=0; j<array2.length; j++) {
			System.out.println(array2[j]);
		}
		
		int[] array3 = {value0, 55, value1};
		for (int k=0; k<array3.length; k++) {
			System.out.println(array3[k]);
		}

	}
}
