
public class ArraysOfStringsClass {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "First";
		words[1] = "Second";
		words[2] = "Third";
		
		System.out.println(words[1]);
		
		String[] otherWords = {"Forth", "Fifth", "Sixth"};
		for (String moreWords: otherWords){
			System.out.println(moreWords);
		}
		
		String[] empty = new String[4];
		for (String resultempty: empty){
			System.out.println(resultempty);	
		}
		
				
	}
}
