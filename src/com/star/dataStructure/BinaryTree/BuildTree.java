/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  BuildTree.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  ����������,��������������,�������.
 * @author: ����16��ͨ 
 * @date:   2018��12��28�� ����2:53:12   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.List;

/**   
 * @ClassName:  BuildTree   
 * @Description:����������,��������������,�������.
 * @author: ����16��ͨ
 * @date:   2018��12��28�� ����2:53:12   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class BuildTree {

	/**   
	 * @Title: buildBinTree   
	 * @Description: ������ͨ������ .
	 * @param: @param arr ���ڵ�ֵ����.
	 * @param: @return      
	 * @return: TreeNode  �����ڵ�.
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
		
		//��[0,2i-1)�Ľڵ㸳�������ӽڵ�(���ö���������)
		for (int i = 0; i < n/2 - 1; i++) {
			nodes.get(i).left = nodes.get(2*i+1);
			nodes.get(i).right = nodes.get(2*i+2);
		}
		//��2i-1���ڵ㵥������(��Ϊ������ֻ��һ���ӽڵ�)
		int lastIndex = n/2 -1;
		nodes.get(lastIndex).left = nodes.get(2*lastIndex+1);
		//����ڵ���ĿΪ����,lastIndex�������ӽڵ�
		if (n%2 == 1) {
			nodes.get(lastIndex).right = nodes.get(2*lastIndex+2);
		}
		
		return nodes.get(0);
	}
	
	
	/**   
	 * @Title: buildBinarySearchTree   
	 * @Description: ��������������,�������.  
	 * @param: @param arr ԭʼ����.
	 * @param: @return      
	 * @return: TreeNode   �����ڵ�.   
	 * @throws   
	 */
	public static TreeNode buildBinarySearchTree(int[] arr) {
		//������ĵ�һ��ֵ��Ϊ�������������ڵ��ֵ
		TreeNode root = new TreeNode(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			SearchTreeOpration.addNode(root, arr[i]);
		}
		
		return root;
	}
	
	
	
	
}
