import java .util.*;
public class Stack {
    static class stackUsingArraylist{
        static ArrayList<Integer>list = new ArrayList<>();
        //check is empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push data or add element
        public static void push(int data){
            list.add(data);
        }
        //remove element
        public static int pop(){
            if(isEmpty()){
                System.out.print("stack is empty");
                return-1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek element  look at the top element;
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main (String[] args){
        stackUsingArraylist s = new stackUsingArraylist();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("top element(peek)" + s.peek());
        System.out.println("Popping elements:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
