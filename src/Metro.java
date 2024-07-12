import java.util.ArrayList;

public class Metro {

	public static void main(String[] args) {

		ArrayList<int[]> stops = new ArrayList<int[]>();

		stops.add(new int[] { 10, 0 });
		stops.add(new int[] { 3, 5 });
		stops.add(new int[] { 2, 5 });

		System.out.println(countPassengers(stops));
	}

	public static int countPassengers(ArrayList<int[]> stops) {
		if (stops.isEmpty())
			return 0;

		ArrayList<Integer> ins = new ArrayList<Integer>();
		ArrayList<Integer> outs = new ArrayList<Integer>();

		int totalIns = 0;
		int totalOuts = 0;
		for (int[] array : stops) {
			ins.add(array[0]);
			outs.add(array[1]);
		}

		for (int i : ins) {
			totalIns += i;
		}

		for (int j : outs) {
			totalOuts += j;
		}

		return (totalIns - totalOuts) >= 0 ? (totalIns - totalOuts) : 0;

	}
}

// Best Practice
//return stops.stream()
//        .mapToInt(x -> x[0] - x[1])
//        .sum();

// Another result
//int res = 0;
//for(int[] onOff : stops) res += onOff[0] - onOff[1];
//return res;