import java.util.*;
public class deletespace {
    public static void space(String st){
        String result = "";
        for(int i=0;i<=st.length()-1;i++){
            char ch = st.charAt(i);
            if(ch !=' '){
                result += ch;
            }   
        }
        System.out.print(result);
    }
    public static void main (String args[]){
        String st = "T C S N Q T";
        space(st);
    }
}