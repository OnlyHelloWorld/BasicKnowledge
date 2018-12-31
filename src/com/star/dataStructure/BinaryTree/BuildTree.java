/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  BuildTree.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  建立二叉树,二叉搜索树函数,方便测试.
 * @author: 吉大16沈通 
 * @date:   2018年12月28日 下午2:53:12   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**   
 * @ClassName:  BuildTree   
 * @Description:建立二叉树,二叉搜索树函数,方便测试.
 * @author: 吉大16沈通
 * @date:   2018年12月28日 下午2:53:12   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class BuildTree {

	/**   
	 * @Title: buildBinTree   
	 * @Description: 构造普通二叉树 .
	 * @param: @param arr 树节点值数组.
	 * @param: @return      
	 * @return: TreeNode  树根节点.
	 * @throws   
	 */
	public static TreeNode buildBinTree(int[] arr) {
		
		int n = arr.length;
		if (n == 0) {
			return null;
		}
		List<TreeNode> nodes = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			nodes.add(new TreeNode(arr[i]));
		}
		
		//将[0,2i-1)的节点赋予左右子节点(利用二叉树性质)
		for (int i = 0; i < n/2 - 1; i++) {
			nodes.get(i).left = nodes.get(2*i+1);
			nodes.get(i).right = nodes.get(2*i+2);
		}
		//第2i-1个节点单独处理(因为他可能只有一个子节点)
		int lastIndex = n/2 -1;
		nodes.get(lastIndex).left = nodes.get(2*lastIndex+1);
		//如果节点数目为奇数,lastIndex才有右子节点
		if (n%2 == 1) {
			nodes.get(lastIndex).right = nodes.get(2*lastIndex+2);
		}
		
		return nodes.get(0);
	}
	
	
	/**   
	 * @Title: buildBinarySearchTree   
	 * @Description: 创建二叉搜索树,方便测试.  
	 * @param: @param arr 原始数组.
	 * @param: @return      
	 * @return: TreeNode   树根节点.   
	 * @throws   
	 */
	public static TreeNode buildBinarySearchTree(int[] arr) {
		//将数组的第一个值成为二叉搜索树根节点的值
		TreeNode root = new TreeNode(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			SearchTreeOpration.addNode(root, arr[i]);
		}
		
		return root;
	}
	
	
	
	
}
