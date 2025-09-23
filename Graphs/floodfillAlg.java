import java. util.*;
public class floodfillAlg {
    public void helper(int [][] image,int sr,int sc,int color,boolean vis[][],int orgcol){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||vis[sr][sc]||image[sr][sc]!=orgcol){
            return;
        }
        image[sr][sc]=color;
        helper(image, sr, sc-1, color, vis, orgcol);
        helper(image, sr, sc+1, color, vis, orgcol);
        helper(image, sr-1, sc, color, vis, orgcol);
        helper(image, sr+1, sc, color, vis, orgcol);
    }
    public int [][]  FloodFill(int [][] image,int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        
        floodfillAlg obj = new floodfillAlg();
        int[][] result = obj.FloodFill(image, 1, 1, 2);
         for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}