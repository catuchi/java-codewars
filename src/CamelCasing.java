import java.util.*;
import java.lang.StringBuilder;

public class CamelCasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "The_Stealth-Warrior";
		System.out.println(toCamelCase(phrase));
	}
	
	static String toCamelCase(String s) {

		char[] charArray = s.toCharArray();
		
		StringBuilder sb = new StringBuilder(charArray.length);
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '-' || charArray[i] == '_') {
				charArray[i+1] = Character.toUpperCase(charArray[i+1]);
			} else {
				sb.append(charArray[i]);
			}
		}
		
		String result = sb.toString();
		
		return result;
	}

}
