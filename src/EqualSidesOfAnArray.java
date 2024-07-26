import java.util.Arrays;

public class EqualSidesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {20,10,-80,10,10,15,35};
		System.out.println(findEvenIndex(intArr));
	}
	
	public static int findEvenIndex(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int[] leftArr = Arrays.copyOfRange(arr, 0, i);
			int leftSum = Arrays.stream(leftArr).sum();
			
			int[] rightArr = Arrays.copyOfRange(arr, i + 1, arr.length);
			int rightSum = Arrays.stream(rightArr).sum();
			
			if (leftSum == rightSum)
				return i;
		}
		return -1;
	}

}
