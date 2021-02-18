package DynamicProgrammingStringsArray.LongestCommonSubString;

import java.util.Arrays;

public class LongestCommonSubstring {
    public int longestCommonSubString(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        char[] X = text1.toCharArray();
        char[] Y = text2.toCharArray();

        return  lcs(X,Y,m,n);
    }

    private int lcs(char[] X, char[] Y, int m, int n){
        StringBuilder sb = new StringBuilder();
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for(int i=0; i<=m;i++ ){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                } else if(X[i-1] == Y[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                    if(max < dp[i][j]){
                        max = dp[i][j];
                        sb.append(X[i-1]);
                    }
                } else{
                    dp[i][j] = 0;
                }
            }
            System.out.println("===========");
            System.out.println(Arrays.deepToString(dp).replace("], ", "]\n")
                    .replace("[[", "[").replace("]]", "]"));

        }

        System.out.println(sb);
        return max;
    }
}
