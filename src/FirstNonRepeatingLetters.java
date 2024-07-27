import java.util.*;

public class FirstNonRepeatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "moonmoon";
		System.out.println(firstNonRepeatingLetter(str));
	}
	
	public static String firstNonRepeatingLetter(String s) {
		// scan through the letters
		// at each index check remaining letters to see if any character matched current one
		String lower = s.toLowerCase();
		char[] charArray = lower.toCharArray();
		char[] copyArr = s.toCharArray();
		int result;

		for (int i = 0; i < s.length(); i++) {
			char[] remainder = Arrays.copyOfRange(charArray, i + 1, charArray.length);
			Arrays.sort(remainder);
			result = Arrays.binarySearch(remainder, charArray[i]);
			
			if (result < 0) {
				String str = String.valueOf(copyArr[i]);
				return str;
			}
		}


		return "";
	}

}
