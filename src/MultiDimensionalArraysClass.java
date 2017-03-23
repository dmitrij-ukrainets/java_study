import java.util.Arrays;

public class MultiDimensionalArraysClass {
	public static void main(String[] args) {
		
		int[][] numbers = {
				{1, 2, 3, 4},
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}
		};
		//System.out.println(numbers[2][0]);
		for (int row=0; row<numbers.length; row++){
			for(int coloumn=0; coloumn<numbers[row].length; coloumn++){
				System.out.print(numbers[row][coloumn] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[3][];
		words[0] = new String[3];
		words[0][0] = "First-First";
		words[0][1] = "First-Second";
		words[0][2] = "First-Third";
		words[1] = new String[3];
		words[1][0] = "Second-First";
		words[1][1] = "Second-Second";
		words[2] = new String[3];
		//System.out.println(words[1][1]);
		//for (String stringRow=0; stringRow<words.length; stringRow++) {
			//for (String stringColoumn=0; stringColoumn<words[stringRow].length; stringColoumn++) {
				//System.out.print(words[stringRow][stringColoumn] + "\t");
			//}
			//System.out.println();
		//}
		System.out.println(Arrays.deepToString(words) + "\t");
		
	}
}
