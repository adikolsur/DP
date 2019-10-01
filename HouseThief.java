package DP;

import java.util.Scanner;

public class HouseThief {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[]dp=new int[n];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0],arr[1]);
		for(int i=2;i<n;i++) {
			dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
		}
		System.out.println(dp[n-1]);
	}
}
