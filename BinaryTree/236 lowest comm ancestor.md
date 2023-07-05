# 236. [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/)

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

### Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1

Output: 3

Explanation: The LCA of nodes 5 and 1 is 3.

## [Leetcode Solution Source](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/solutions/65225/4-lines-c-java-python-ruby/)

## [Video Explanation](https://youtu.be/13m9ZCB8gjw)

## Algorithm Working 
* Algorithm works in O(n) and uses recursion
* Start from root and transverses tree till any one of the nodes is found
* If any node is found, then return the node
* Similarly other subtree finds path and once node found, it is returned
* If node returns null, meaning node not found in that subtree
* We return the not null node that points to the node to be found
* When both children return non null node, it indicates that both nodes have been found

## Code
```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null || root == p || root == q) return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    //return left == null ? right : right == null ? left : root;
    if(left == null && right == null) return null; 
    if(left != null && right != null) return root;  
    return left == null ? right : left;
}
```