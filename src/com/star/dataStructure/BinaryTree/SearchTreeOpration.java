/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  SearchTreeOpration.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  ����������ʱ�Ĳ�������ͱ���. 
 * @author: ����16��ͨ 
 * @date:   2018��12��31�� ����6:43:05   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**   
 * @ClassName:  SearchTreeOpration   
 * @Description:�����������Լ�����������.
 * @author: ����16��ͨ
 * @date:   2018��12��31�� ����6:43:05   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class SearchTreeOpration {

	/**   
	 * @Title: addNode   
	 * @Description: ������������ӽڵ�.   
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
     * @Description: ������ǰ�����.   
     * @param: @param root  �����ڵ�.    
     * @return: void  ���ؿ�.    
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
     * @Description: �������������.   
     * @param: @param root  �����ڵ�.    
     * @return: void   ���ؿ�.   
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
     * @Description: �������������.   
     * @param: @param root �����ڵ�.     
     * @return: void  ���ؿ�.    
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
     * @Description: ͨ��ջʵ�������������.   
     * @param: @param root �����ڵ�.
     * @return: void  ���ؿ�.    
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
			
			//ע��:�������ҽڵ�����ջ,��ڵ����ջ,�������ܰ���������˳�����
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
     * @Description: ͨ��ջʵ���������.  
     * @param: @param root ���ڵ�.
     * @return: void  ���ؿ�.
     * @throws   
     */
    public static void stackTraversalInOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		
		//��������ֽ��ģ��һ�¾�������
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
     * @Description: ͨ��ջʵ�ֶ������������(��ʱû�����).   
     * @param: @param root �����ڵ�.
     * @return: void  ���ؿ�.    
     * @throws   
     */
    public static void stackTraversalPostOrder(TreeNode root) {
		return;
	}
    
    /**   
     * @Title: queueLayerOrder   
     * @Description: ͨ������ʵ�ֶ������Ĳ�α���.
     * @param: @param root �����ڵ�.
     * @return: void  ���ؿ�.
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
