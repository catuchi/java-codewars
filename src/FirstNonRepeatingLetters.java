import java.util.*;

public class FirstNonRepeatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Like To Take Candy From A Baby";
		System.out.println(firstNonRepeatingLetter(str));
	}
	
	public static String firstNonRepeatingLetter(String s) {
		// scan through the letters
		// at each index check remaining letters to see if any character matched current one
		String lower = s.toLowerCase();
		char[] lowerCaseArr = lower.toCharArray();
		char[] charArray = s.toCharArray();
		char targetChar;
		char[] remainder;
		char[] leftside;
		int result;
		int result1;
		int result2;
		int result3;
		
//		for (char c : charArray) {
//			if (c == targetChar) {
//				return "true";
//			}
//		}
		
//		Arrays.sort(charArray);
//		System.out.println(Arrays.binarySearch(charArray, targetChar));
		
//		System.out.println(IntStream.range(0, charArray.length).anyMatch(i -> charArray[i] == targetChar));
		
		for (int i = 0; i < charArray.length; i++) {
			targetChar = lowerCaseArr[i];
			
			remainder = Arrays.copyOfRange(lowerCaseArr, i + 1, charArray.length);
			leftside = Arrays.copyOfRange(lowerCaseArr, 0, i);
			
			Arrays.sort(remainder);
			Arrays.sort(leftside);
			
			result = Arrays.binarySearch(remainder, lowerCaseArr[i]);
			result1 = Arrays.binarySearch(remainder, Character.toUpperCase(targetChar));
			result2 = Arrays.binarySearch(leftside, lowerCaseArr[i]);
			result3 = Arrays.binarySearch(leftside, Character.toUpperCase(targetChar));
			
			if (result < 0 && result1 < 0 && result2 < 0 && result3 < 0) {
				return Character.toString(charArray[i]);
			}
		}

		return "";
	}

}
