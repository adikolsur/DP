package DP;

import java.util.Scanner;

public class CuttingRod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = s.nextInt();
		}
		System.out.println(maxValue(price, n));
	}

	public static int maxValue(int[] price, int n) {
		int[] max = new int[n + 1];
		max[0] = 0;
		for (int i = 1; i <= n; i++) {
			int maxVal = 0;
			for (int j = 0; j < i; j++) {
				maxVal = Math.max(maxVal, price[j] + max[i - j - 1]);
			}
			max[i] = maxVal;
		}
		return max[n];
	}
}
