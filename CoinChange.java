package DP;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		int[] s = new int[m];
		for (int i = 0; i < m; i++) {
			s[i] = p.nextInt();
		}
		int n = p.nextInt();
		long ans = countchange(s, m, n);
		System.out.println(ans);
	}

	public static long countchange(int[] s, int m, int n) {
		long[] ans = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			ans[i] = 0;
		}
		ans[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = s[i]; j <= n; j++) {
				ans[j] += ans[j - s[i]];
			}
		}
		return ans[n];
	}
}
