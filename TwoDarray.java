import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        int matrix[][]= { {1,2,3},
                          {4,5,6},
                          {7,8,9}
                        };
        for(int i=0;i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();   
        }                
    }
}
