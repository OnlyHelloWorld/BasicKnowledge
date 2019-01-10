/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  RangeSumOfBSTBy938.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description: 遍历二叉搜索树的范围和.
 * @author: 吉大16沈通 
 * @date:   2019年1月1日 下午1:10:10   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**   
 * @ClassName:  RangeSumOfBSTBy938   
 * @Description:给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
				二叉搜索树保证具有唯一的值。
 * @author: 吉大16沈通
 * @date:   2019年1月1日 下午1:10:10   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class RangeSumOfBSTBy938 {
	/**   
	 * @Title: rangeSumBST   
	 * @Description: 主要对该搜索树进行遍历,根据二叉搜索树性质,如果该节点值在L--R之间,则满足提议要求.
	 * 					注:此题本意应该对树进行中序遍历,然后得到结果数组,则L--R之间的元素全部满足要求. 
	 * @param: @param root
	 * @param: @param L
	 * @param: @param R
	 * @param: @return      
	 * @return: int      
	 * @throws   
	 */
	public static int rangeSumBST(TreeNode root, int L, int R) {
        int res = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(isIn(node.val,L,R))
                res = res + node.val;
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        return res;
        
    }
    /**   
     * @Title: isIn   
     * @Description: 判断该节点的值是否在L--R之间. 
     * @param: @param a 需要判断的节点值.
     * @param: @param L  范围左值.
     * @param: @param R  范围右值.
     * @param: @return      
     * @return: boolean  返回判断结果.    
     * @throws   
     */
    public static boolean isIn(int a,int L,int R){
        if(a>= L && a<= R)
            return true;
        return false;
    }
}
