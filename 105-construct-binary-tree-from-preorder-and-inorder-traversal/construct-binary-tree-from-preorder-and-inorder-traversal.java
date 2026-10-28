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
    private Map<Integer, Integer> inorderIndexMap;
    private int preOrderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrderIndex = 0;
        inorderIndexMap = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        
        return arrayToTree(preorder, 0, inorder.length - 1);
    }
    
    private TreeNode arrayToTree(int[] preorder, int left, int right) {
        
        if (left > right) {
            return null;
        }
        
        int rootValue = preorder[preOrderIndex++];
        TreeNode root = new TreeNode(rootValue);
        
        int mid = inorderIndexMap.get(rootValue);
        
        root.left = arrayToTree(preorder, left, mid - 1);
        root.right = arrayToTree(preorder, mid + 1, right);
        
        return root;
    }
}