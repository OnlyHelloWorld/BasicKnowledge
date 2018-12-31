/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  TreeNode.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:    TODO 
 * @author: 吉大16沈通 
 * @date:   2018年12月26日 下午6:43:10   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

/**   
 * @ClassName:  TreeNode   
 * @Description:树节点类的定义.
 * @author: 吉大16沈通
 * @date:   2018年12月26日 下午6:43:10   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TreeNode {

	int val;
	TreeNode right;
	TreeNode left;
	/**   
	 * @Title:  TreeNode   
	 * @Description: 树节点构造函数.
	 * @param:    val 树节点的值.
	 * @throws   
	 */
	public TreeNode(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
		right = null;
		left = null;
	}
	
}
