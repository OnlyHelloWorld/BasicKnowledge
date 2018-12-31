/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  LowestCommonAncestorOfABinaryTreeBy236.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description:  �ݹ��������������������.
 * @author: ����16��ͨ 
 * @date:   2018��12��26�� ����7:19:25   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

/**   
 * @ClassName:  LowestCommonAncestorOfABinaryTreeBy236   
 * @Description:����һ��������, �ҵ�����������ָ���ڵ������������ȡ�
				�ٶȰٿ�������������ȵĶ���Ϊ���������и��� T ��������� p��q��
				����������ȱ�ʾΪһ����� x������ x �� p��q �������� x ����Ⱦ����ܴ�һ���ڵ�Ҳ���������Լ������ȣ�����.
				(LCA����,ͦ����,����ٶȼ��˽�һ��).
 * @author: ����16��ͨ
 * @date:   2018��12��26�� ����7:19:25   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LowestCommonAncestorOfABinaryTreeBy236 {

	/**   
	 * @Title: lowestCommonAncestor   
	 * @Description: ͨ���ݹ���⹫������,��Ҫ�еݹ���˽�,���Եݹ�ִ��˳��������
	 * 				����鿴https://wenku.baidu.com/view/44f11f39dd36a32d73758162.html(���԰ٶ��Ŀ�).
	 * 				���⾭���ݹ����֮��,right��left������һϵ�б仯,���ջ᷵�ع�������,��ʵ����ջ�ĵ��õ���˳��.
	 * @param: @param root �����ڵ�.
	 * @param: @param p ���ڵ�1.
	 * @param: @param q ���ڵ�2.
	 * @param: @return      
	 * @return: TreeNode      ���صĹ�������.
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
