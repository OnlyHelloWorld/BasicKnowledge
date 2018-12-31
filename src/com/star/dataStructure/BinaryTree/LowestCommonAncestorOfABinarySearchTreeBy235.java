/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  LowestCommonAncestorOfABinarySearchTreeBy235.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  �ݹ��������������������������.
 * @author: ����16��ͨ 
 * @date:   2018��12��26�� ����6:40:28   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

/**   
 * @ClassName:  LowestCommonAncestorOfABinarySearchTreeBy235   
 * @Description:����һ������������, �ҵ�����������ָ���ڵ������������ȡ�
				�ٶȰٿ�������������ȵĶ���Ϊ���������и��� T ��������� p��q��
				����������ȱ�ʾΪһ����� x������ x �� p��q �������� x ����Ⱦ����ܴ�һ���ڵ�Ҳ���������Լ������ȣ�����.
				ע:��ͨ��������������������ο�LowestCommonAncestorOfABinaryTreeBy236.java�ļ�.(LCA����,��ʵ�ܸ���,����ٶ��˽�һ��).
 * @author: ����16��ͨ
 * @date:   2018��12��26�� ����6:40:28   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LowestCommonAncestorOfABinarySearchTreeBy235 {

	/**   
	 * @Title: lowestCommonAncestor   
	 * @Description: ͨ���ݹ����,�ж�:p,q��root���ı�?������ֵС��root,��������ȱض���root��������(����������������).  
	 * @param: @param root �����ڵ�.
	 * @param: @param p ���ڵ�1.
	 * @param: @param q ���ڵ�2.
	 * @param: @return   �ҵ��������������.
	 * @return: TreeNode  �ҵ��������������.    
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
