package july2020;

public class PrisonCellsAfterNDays {

	public int[] prisonAfterNDays(int[] cells, int N) {
		if (N <= 7) {
			while (N > 0) {
				cells = nextDay(cells);
				N--;
			}
			return cells;
		} else if (N <= 14) {
			return reverse(prisonAfterNDays(cells, N - 7));
		} else {
			int days = N % 14 == 0 ? 14 : N % 14;
			return prisonAfterNDays(cells, days);
		}
	}

	private int[] nextDay(int[] curr) {
		int[] res = new int[8];
		res[0] = 0;
		res[7] = 0;
		for (int i = 1; i <= 6; i++) {
			res[i] = curr[i - 1] == curr[i + 1] ? 1 : 0;
		}
		return res;
	}

	private int[] reverse(int[] curr) {
		for (int i = 0; i < 4; i++) {
			int j = 7 - i;
			int temp = curr[i];
			curr[i] = curr[j];
			curr[j] = temp;
		}
		return curr;
	}

}
