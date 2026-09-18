class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result ,new StringBuilder(),0,0,n);
        return result;
    }
    public void backtrack(List<String>result, StringBuilder current , int open , int close , int n){
        //base case
        if(current.length() == n*2){
            result.add(current.toString());
            return;
        }
        //choise 1 
        if(open < n){
            current.append('(');
            backtrack(result , current , open+1, close, n);
             current.deleteCharAt(current.length()-1);
        }
        //choise 2
        if(close < open){
            current.append(')');
            backtrack(result , current , open, close+1, n);
            current.deleteCharAt(current.length()-1);
        }
    }
}