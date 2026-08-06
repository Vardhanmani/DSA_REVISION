import java.util.*;
public class reverdthestring {
    public static String revers (char[] ch, int start,int end){
        if(start>=end){
            return new String(ch);
        }
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        return revers(ch,start+1,end-1);
    }
    public static void main (String args[]){
        String str = "manivardhan";
        char[] charr = str.toCharArray();
        String result = revers(charr , 0 , charr.length-1);
        System.out.println(result);
    }
}
