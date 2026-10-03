class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>Spiral = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return Spiral;
        }
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(left<=right && top<=bottom){
            for(int col=left ; col<=right ; col++){
                Spiral.add(matrix[top][col]);
            }
            top++;
            for(int row=top ; row<=bottom; row++){
                Spiral.add(matrix[row][right]);
            }
            right--;
            if(bottom>=top){
            for(int bot=right ; bot>=left ; bot--){
                Spiral.add(matrix[bottom][bot]);
            }
            bottom--;
            }
            if(right>=left){
            for(int lef=bottom ; lef>=top ; lef--){
                Spiral.add(matrix[lef][left]);
            }
            left++;
            }
        }
        return Spiral;
    }
}