import java.util.ArrayList;

public class BreakCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "camelCasing";
		System.out.println(camelCase(str));
	}
	
	public static String camelCase(String input) {
		// loop through string
		// create result array
		// at each index check if char at index equal to capitalized char at index
		// if it is push a space then push the index
		
		ArrayList<Character> withSpace = new ArrayList<>();
		for (char c : input.toCharArray()) {
			
			if (c != Character.toUpperCase(c)) {
				withSpace.add(c);
			} else {
				withSpace.add(' ');
				withSpace.add(c);
			}

		}
		
		StringBuilder sb = new StringBuilder(withSpace.size());
		
		for (Character ch : withSpace) {
			sb.append(ch);
		}
		
//		String result = sb.toString();
		
		return sb.toString();
	}

}

// best practice
//public static String camelCase(String input) {
//    return input.replaceAll("([A-Z])", " $1");
//  }