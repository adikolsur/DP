package DP;

import java.util.Scanner;

public class FriendsPairing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ans = new int[n + 1];
		ans[0] = 0;
		ans[1] = 1;
		ans[2]=2;
		for (int i = 3; i <= n; i++) {
			ans[i] = ans[i - 1] + (i - 1) * ans[i - 2];
		}
		System.out.println(ans[n]);
	}

}
