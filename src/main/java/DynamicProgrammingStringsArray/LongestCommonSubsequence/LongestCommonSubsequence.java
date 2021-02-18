package DynamicProgrammingStringsArray.LongestCommonSubsequence;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int len;

        char[] X = text1.toCharArray();
        char[] Y = text2.toCharArray();
        int m = text1.length();
        int n = text2.length();


        return  len = lcs(X,Y,m,n);
    }

    private int lcs(char[] X, char[] Y, int m, int n){

        int[][] matrix = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0){
                    matrix[i][j] = 0;
                }else if(X[i-1] == Y[j-1]){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
            }
        }
        return matrix[m][n];

    }
}
