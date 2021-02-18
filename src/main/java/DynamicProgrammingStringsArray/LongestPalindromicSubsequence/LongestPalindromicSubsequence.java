package DynamicProgrammingStringsArray.LongestPalindromicSubsequence;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];

        // for length 1 it is always palindorm. Lets feel it with 1

        for(int i=0, j = 0; i<n; i++, j++){
            dp[i][j] = 1;
        }

        System.out.println(Arrays.deepToString(dp).replace("], ", "]\n")
                .replace("[[", "[").replace("]]", "]"));

        System.out.println("===========");
        // now calculate for 2 or more length
        for(int curr_len = 2; curr_len <= n; curr_len++){
            int ka = n - curr_len + 1;
            for(int i = 0; i< n - curr_len + 1; i++){
                int j = i+curr_len-1; // removed the last item from the range then add when i =1;

                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2 + dp[i+1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
            System.out.println("===========");
            System.out.println(Arrays.deepToString(dp).replace("], ", "]\n")
                    .replace("[[", "[").replace("]]", "]"));
        }

        return dp[0][n-1];

    }
}
