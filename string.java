import java.util.*;
public class string {
    public static void string(String st){
        int count=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch);
                count++;
            }
        }
        System.out.println("\nNumber of vowels: " + count);
    }
    public static void main(String[]args){
        String st="manivardhan";
        string(st);
    }
}
