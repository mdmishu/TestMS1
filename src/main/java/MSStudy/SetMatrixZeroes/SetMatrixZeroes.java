package MSStudy.SetMatrixZeroes;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstRow = false, firstCol = false;

        //check if first contains zero so that we can set the entire row to zero
        for(int i=0; i<row;i++){
            if(matrix[i][0] == 0){
                firstRow = true;
                break;
            }
        }
       // check if column contains zero so that we can set the entire col to zero
        for(int j=0; j<col; j++){
            if(matrix[0][j] == 0){
                firstCol = true;
                break;
            }
        }

        //check inside matrix as well

        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;

                }
            }
        }

        // sent entire row or col
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow){
            for(int j = 0; j<col; j++ ){
                matrix[0][j] = 0;
            }
        }

        if(firstCol){
            for(int i = 0; i<row; i++ ){
                matrix[i][0] = 0;
            }
        }


    }
}
