package project2;

import java.util.Arrays;

/**
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
#NOTE : THIS PROBLEM CAN BE SOLVED ONLY IF INPUT ARRAY IS IN SORTED MANNER,IF NOT SORTED BY DEFAULT,SORT IT USING(Arrays.Sort("input array")).
You may assume that you have an infinite number of each kind of coin.
Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 * @author adity
 *
 */
public class CoinChange {
	public static int coinChange(int[] coins ,int amt) {
		int[] dp = new int[amt+1];
		Arrays.fill(dp, amt+1);
		dp[0]=0;
		for(int i=0;i<=amt;i++) {
			for(int j=0;j<coins.length;j++) {
				if(coins[j]<=i) {
					dp[i]=Math.min(dp[i], 1+dp[i-coins[j]]);
				}else
					break;
			}
		}
		return dp[amt]>amt?-1:dp[amt];
	}

	public static void main(String[] args) {
		int[] coins = {2,1,2,6};
		int amt = 11;
		System.out.println(coinChange(coins,amt));
	}

}
