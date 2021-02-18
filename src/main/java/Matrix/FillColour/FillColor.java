package Matrix.FillColour;

public class FillColor {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

//        for(int i =0; i<image.length; i++){
//            for(int j=0; j<image[0].length;j++ ){
//                 if(image[i][j] == 1){
//                     dfs(image,i,j);
//                 }
//            }
//        }

        dfs(image, sr,sc,newColor, image[sr][sc]);

        return image;
    }


    private void dfs(int[][] image, int i, int j, int newColor, int color){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j] != color){
            return;
        }



        image[i][j] = newColor;

        dfs(image, i-1,j,newColor,color);
        dfs(image,i+1,j,newColor,color);
        dfs(image, i, j-1,newColor,color);
        dfs(image, i,j+1,newColor,color);

    }

}
