import java .util.*;
public class Recursion {
    public static void printCountdown(int n) {
    for (int i = n; i >= 1; i--) {
        System.out.println(i);
    }
}
  public static void main(String[] args){
    int n=9;
    printCountdown(n);
  }
}
