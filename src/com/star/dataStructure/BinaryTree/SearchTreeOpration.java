/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  SearchTreeOpration.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  建立二叉树时的插入操作和遍历. 
 * @author: 吉大16沈通 
 * @date:   2018年12月31日 下午6:43:05   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**   
 * @ClassName:  SearchTreeOpration   
 * @Description:创建二叉树以及二叉树遍历.
 * @author: 吉大16沈通
 * @date:   2018年12月31日 下午6:43:05   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class SearchTreeOpration {

	/**   
	 * @Title: addNode   
	 * @Description: 二叉搜索树添加节点.   
	 * @param: @param root
	 * @param: @param num      
	 * @return: void      
	 * @throws   
	 */
	public static void addNode(TreeNode root,int num) {
        if (num < root.val) {
            if (root.left != null) {
                addNode(root.left,num);
            } else {
                root.left = new TreeNode(num);
            }
            return;
        }

        if (root.right != null) {
            addNode(root.right,num);
        } else {
            root.right = new TreeNode(num);
        }
        return;
    }
    /**   
     * @Title: traversePreOrder   
     * @Description: 二叉树前序遍历.   
     * @param: @param root  树根节点.    
     * @return: void  返回空.    
     * @throws   
     */
    public static void traversePreOrder(TreeNode root) {
        System.out.print(root.val);
        if (root.left != null) {
            traversePreOrder(root.left);
        }
        if (root.right != null) {
            traversePreOrder(root.right);
        }
    }

    /**   
     * @Title: traverseInOrder   
     * @Description: 二叉树中序遍历.   
     * @param: @param root  树根节点.    
     * @return: void   返回空.   
     * @throws   
     */
    public static void traverseInOrder(TreeNode root) {
        if (root.left != null) {
            traverseInOrder(root.left);
        }
        System.out.print(root.val);
        if (root.right != null) {
            traverseInOrder(root.right);
        }
    }

    /**   
     * @Title: traversePostOrder   
     * @Description: 二叉树后序遍历.   
     * @param: @param root 树根节点.     
     * @return: void  返回空.    
     * @throws   
     */
    public static void traversePostOrder(TreeNode root) {
        if (root.left != null) {
            traversePostOrder(root.left);
        }
        if (root.right != null) {
            traversePostOrder(root.right);
        }
        System.out.print(root.val);
    }
    /**   
     * @Title: stackTraversalPreOrder   
     * @Description: 通过栈实现树的先序遍历.   
     * @param: @param root 树根节点.
     * @return: void  返回空.    
     * @throws   
     */
    public static void stackTraversalPreOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) {
			stack.push(root);
		}
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			System.out.print(node.val);
			
			//注意:这里让右节点先入栈,左节点后入栈,这样才能按照中左右顺序遍历
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}
    /**   
     * @Title: stackTraversalInOrder   
     * @Description: 通过栈实现中序遍历.  
     * @param: @param root 根节点.
     * @return: void  返回空.
     * @throws   
     */
    public static void stackTraversalInOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		
		//看不懂在纸上模拟一下就容易了
		while (root != null || !stack.empty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (!stack.empty()) {
				TreeNode node = stack.pop();
				System.out.print(node.val);
				root = node.right;
			}
		}
	}
    /**   
     * @Title: stackTraversalPostOrder   
     * @Description: 通过栈实现二叉树后序遍历(暂时没想出来).   
     * @param: @param root 树根节点.
     * @return: void  返回空.    
     * @throws   
     */
    public static void stackTraversalPostOrder(TreeNode root) {
		return;
	}
    
    /**   
     * @Title: queueLayerOrder   
     * @Description: 通过队列实现二叉树的层次遍历.
     * @param: @param root 树根节点.
     * @return: void  返回空.
     * @throws   
     */
    public static void queueLayerOrder(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		if (root != null) {
			queue.add(root);
		}
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}
	
}
