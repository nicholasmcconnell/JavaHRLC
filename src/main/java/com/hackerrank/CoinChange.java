package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class CoinChange {

    public static void main(String[] arg) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));


    }

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        Arrays.fill(dp, amount+1);

        dp[0] =0;

        for(int i = 1; i<=amount; i++){
            for(int j = 0; j<coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount] > amount ?-1:dp[amount];
    }
}
