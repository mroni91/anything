
public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] integers = { { 1, 2 }, { 3, 5 } };

		integers[1][1] = 4;

		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[i].length; j++) {
				System.out.print(integers[i][j]);
			}
			System.out.println();

		}

	}

}
