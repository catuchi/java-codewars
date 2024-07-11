import java.util.ArrayList;

public class JadenCaseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tweet = "How can mirrors be real if our eyes aren't real";
		System.out.println(toJadenCase(tweet));
	}

	// coverts strings to capitalize every word (how Jaden Smith will write it)
	// returns a null value for an empty string or null
	public static String toJadenCase(String phrase) {
		if (phrase == null || phrase.isBlank()) {
			return null;
		}

		String[] splitPhrase = phrase.split(" ");
		
		ArrayList<String> capsPhrase = new ArrayList<String>();
		
		for (String word : splitPhrase) {
			String[] wordSplit = word.split("");
			for (int i = 0; i < word.length(); i++) {
				if (i == 0) {
					wordSplit[i] = wordSplit[i].toUpperCase();
				}
			}
			String capsWord = String.join("", wordSplit);
			capsPhrase.add(capsWord);
		}
		
		String result = String.join(" ", capsPhrase);
		
//		System.out.println(result);
		
		return result;
	}
}
