/**
*In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
*Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
*We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
*Return true if and only if the nodes corresponding to the values x and y are cousins.
*/


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
   int xDepth=0;;
    int yDepth=0;;
    boolean cousins = true;
    public  boolean isCousins(TreeNode root, int x, int y) {
      TreeNode currentNode = root;
      depth(currentNode, x, y, 0);
      
      traverse(root, x, y);;
      return xDepth==yDepth && cousins;
    }
  
  private  void traverse(TreeNode root, int x, int y){
    if(root==null){
      return; 
    }
    if(root.left!=null && root.right!=null && (root.left.val==x && root.right.val==y || root.left.val==y && root.right.val==x)){
       cousins = false;
    }
    traverse(root.left, x,y);
    traverse(root.right, x,y);
  }
   
  private  int depth(TreeNode root, int x, int y, int depth){
    if(root==null){
      return depth;
    }
    if(root.val == x){
      xDepth = depth; 
    }
    
    if(root.val == y){
      yDepth = depth; 
    }
    depth(root.left, x, y, depth+1);
    depth(root.right, x, y, depth+1);
    
    return depth;
  }
}
