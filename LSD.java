public class LSD
{
	public static void sort(String[] a, int W)
	{
		//sort a[] through W char
		int N = a.length;
		int R = 256;
		String[] aux = new String[N];

		for (int d = W-1; d >= 0; d--) {
			//sort with key-index-account for each char d
			int[] count = new int[R+1];
			//calculate frequencey
			for (int i = 0; i < N; i++)
				count[a[i].charAt(d) + 1]++;
			//translate frequencey to index
			for (int r = 0; r < R; r++)
				count[r+1]  += count[r];
			//classify elements
			for (int i = 0; i < N; i++)
				aux[count[a[i].charAt(d)]++] = a[i];
			//write back
			for (int i = 0; i < N; i++)
				a[i] = aux[i];
		}
	}
}