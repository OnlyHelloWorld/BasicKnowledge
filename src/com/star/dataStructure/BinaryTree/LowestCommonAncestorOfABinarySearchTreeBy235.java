/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  LowestCommonAncestorOfABinarySearchTreeBy235.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  递归求解二叉搜索树的最近公共祖先.
 * @author: 吉大16沈通 
 * @date:   2018年12月26日 下午6:40:28   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

/**   
 * @ClassName:  LowestCommonAncestorOfABinarySearchTreeBy235   
 * @Description:给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
				百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
				最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”.
				注:普通二叉树最近公共祖先求解参考LowestCommonAncestorOfABinaryTreeBy236.java文件.(LCA问题,其实很复杂,建议百度了解一下).
 * @author: 吉大16沈通
 * @date:   2018年12月26日 下午6:40:28   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LowestCommonAncestorOfABinarySearchTreeBy235 {

	/**   
	 * @Title: lowestCommonAncestor   
	 * @Description: 通过递归求解,判断:p,q在root的哪边?如果最大值小于root,则最近祖先必定在root的左子树(二叉搜索树的性质).  
	 * @param: @param root 树根节点.
	 * @param: @param p 树节点1.
	 * @param: @param q 树节点2.
	 * @param: @return   找到的最近公共祖先.
	 * @return: TreeNode  找到的最近公共祖先.    
	 * @throws   
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null || p == null || q == null) {
			return null;
		}

		if (Math.max(p.val, q.val) < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}else if (Math.min(p.val, q.val) > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		}else {
			return root;
		}
    }
	
}
