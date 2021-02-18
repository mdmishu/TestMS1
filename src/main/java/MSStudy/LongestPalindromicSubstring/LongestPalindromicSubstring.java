package MSStudy.LongestPalindromicSubstring;

import java.util.Arrays;
//O(n^2) solution with DP....
public class LongestPalindromicSubstring {
    // This function prints the longest
    // palindrome substring of str[].
    // It also returns the length of the
    // longest palindrome
    public String longestPalindrome(String s) {

        int n = s.length();
        int maxLength = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];
        //int[][] dp = new int[n][n];
int count =0;
        // All substrings of length 1 are palindromes
        for(int i=0; i<n; i++) dp[i][i] = true; count++;
//        for(int i=0; i<n; i++) {
//            dp[i][i] = 1;
//        }

        // System.out.println(Arrays.deepToString(dp));

        // check for sub-string of length 2.

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                count++;
                start = i;
                maxLength = 2;
            }
        }
        // Check for lengths greater than 2.
        // k is length of substring
        for(int k=3; k <= n; k++){
            // Fix the starting index
            for(int i=0; i< n-k+1; i++){
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k -1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if ( s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
count++;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }


        System.out.println(Arrays.deepToString(dp).replace("true","1").replace("false", "0")
                .replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        return s.substring(start, start+maxLength);
    }
}
