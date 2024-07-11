
public class NumberFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sq = 121;
		System.out.println(findNextSquare(sq));
	}
	
	// finds the next integral square after one has been passed as a parameter
	// return -1 if the argument passed is not a perfect square
	public static long findNextSquare(long sq) {
		if(Math.sqrt(sq) % Math.floor(Math.sqrt(sq)) == 0.0) {
			return (long) Math.pow(Math.sqrt(sq) + 1, 2);
		}
		
		return -1;
	}
}
