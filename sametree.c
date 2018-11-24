/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* a, struct TreeNode* b) {
    
    if (a==NULL && b==NULL) 
        return 1; 
  
    
    if (a!=NULL && b!=NULL) 
    { 
        return
        ( 
            a->val == b->val && 
            isSameTree(a->left, b->left) && 
            isSameTree(a->right, b->right) 
        ); 
    } 
      
    
    return 0; 
}
