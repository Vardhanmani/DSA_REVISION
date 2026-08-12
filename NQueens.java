import java.util.*;
public class NQueens {
    public static void queen(char bode[][] , int row ){
        if(row == bode.length){
            printbode(bode);
            System.out.println("-----------------");
            return;
        }
        for(int j=0;j<bode.length; j++){
            if(issafe(bode ,row ,j)){
                bode[row][j]='Q';
                queen(bode,row+1);
                bode[row][j]='.';
            }
        }
    }
    public static boolean issafe(char bode[][] , int row, int j){
        //check in the vertical
        for(int i=row-1;i>=0;i--){
            if(bode[i][j]=='Q'){
                return false;
            }
        }
        //upper left
        for(int i=row-1,k=j-1;i>=0 && k>=0; i--,k--){
            if(bode[i][k]=='Q'){
                return false;
            }
        }
        //upper right
        for(int i=row-1,k=j+1;i>=0 && k<bode.length; i--,k++){
            if(bode[i][k]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printbode(char bode[][]){
        for(int  i=0; i<bode.length;i++){
            for(int j=0;j<bode.length;j++){
                System.out.print(bode[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char bode[][] = new char[n][n];
        for(int i=0;i<n; i++){
            Arrays.fill(bode[i],'.');
        }
        queen(bode,0);
    }
}
