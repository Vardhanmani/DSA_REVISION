import java.util.*;
public class recursionfactorial {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        int n=5;
        int totalfactorial = factorial(n);
        System.out.print(totalfactorial);
    }   
}
