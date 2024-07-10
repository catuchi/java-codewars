
public class create_phone_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNumber = createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(phoneNumber);
	}

	public static String createPhoneNumber(int[] numbers) {
		// Your code here!
		String result = "";
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				result += "(";
				result += numbers[i];
				continue;
			}
			if (i == 2) {
				result += numbers[i];
				result += ") ";
				continue;
			}
			if (i == 5) {
				result += numbers[i];
				result += "-";
				continue;
			}
			result += numbers[i];
		}

		return result;
	}

}