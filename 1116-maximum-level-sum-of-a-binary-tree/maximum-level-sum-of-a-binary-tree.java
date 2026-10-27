/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxsum = Integer.MIN_VALUE;
        int maxlevel = 1;
        int currentlevel = 1;
        while(!q.isEmpty()){
            int levelsum = 0;
            int levelsize = q.size();
            for(int i=0;i<levelsize ; i++){
                TreeNode curr= q.poll();
                levelsum += curr.val;
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            if(levelsum > maxsum){
                maxsum = levelsum;
                maxlevel = currentlevel;
            }
            currentlevel++;
        }
        return maxlevel;
    }
}