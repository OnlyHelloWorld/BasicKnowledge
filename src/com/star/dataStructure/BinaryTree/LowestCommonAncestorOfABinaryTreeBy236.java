/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  LowestCommonAncestorOfABinaryTreeBy236.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  递归求解二叉树最近公共祖先.
 * @author: 吉大16沈通 
 * @date:   2018年12月26日 下午7:19:25   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

/**   
 * @ClassName:  LowestCommonAncestorOfABinaryTreeBy236   
 * @Description:给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
				百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
				最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”.
				(LCA问题,挺复杂,建议百度简单了解一下).
 * @author: 吉大16沈通
 * @date:   2018年12月26日 下午7:19:25   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LowestCommonAncestorOfABinaryTreeBy236 {

	/**   
	 * @Title: lowestCommonAncestor   
	 * @Description: 通过递归求解公共祖先,需要有递归的了解,若对递归执行顺序不清晰的
	 * 				建议查看https://wenku.baidu.com/view/44f11f39dd36a32d73758162.html(来自百度文库).
	 * 				此题经过递归调用之后,right和left都经历一系列变化,最终会返回公共祖先,其实就是栈的调用调出顺序.
	 * @param: @param root 树根节点.
	 * @param: @param p 树节点1.
	 * @param: @param q 树节点2.
	 * @param: @return      
	 * @return: TreeNode      返回的公共祖先.
	 * @throws   
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return root;
		}
		
		if (root == p || root == q) {
			return root;
		}
		
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		
		if (right != null && left != null) {
			return root;
		}else if (right != null) {
			return right;
		}else if (left != null) {
			return left;
		}else {
			return null;
		}
    }
	
}
