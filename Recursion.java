import java .util.*;
public class Recursion {
    public static void printCountdown(int n) {
        //basecase
    if(n==0){
        return;
    }
    
    printCountdown(n-1);
    System.out.print(n);
}
  public static void main(String[] args){
    int n=9;
    printCountdown(n);
  }
}
