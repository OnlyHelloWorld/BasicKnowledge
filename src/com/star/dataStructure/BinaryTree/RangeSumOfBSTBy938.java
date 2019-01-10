/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  RangeSumOfBSTBy938.java   
 * @Package com.star.dataStructure.BinaryTree   
 * @Description: ���������������ķ�Χ��.
 * @author: ����16��ͨ 
 * @date:   2019��1��1�� ����1:10:10   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.dataStructure.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**   
 * @ClassName:  RangeSumOfBSTBy938   
 * @Description:���������������ĸ���� root������ L �� R������֮������н���ֵ�ĺ͡�
				������������֤����Ψһ��ֵ��
 * @author: ����16��ͨ
 * @date:   2019��1��1�� ����1:10:10   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class RangeSumOfBSTBy938 {
	/**   
	 * @Title: rangeSumBST   
	 * @Description: ��Ҫ�Ը����������б���,���ݶ�������������,����ýڵ�ֵ��L--R֮��,����������Ҫ��.
	 * 					ע:���Ȿ��Ӧ�ö��������������,Ȼ��õ��������,��L--R֮���Ԫ��ȫ������Ҫ��. 
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
     * @Description: �жϸýڵ��ֵ�Ƿ���L--R֮��. 
     * @param: @param a ��Ҫ�жϵĽڵ�ֵ.
     * @param: @param L  ��Χ��ֵ.
     * @param: @param R  ��Χ��ֵ.
     * @param: @return      
     * @return: boolean  �����жϽ��.    
     * @throws   
     */
    public static boolean isIn(int a,int L,int R){
        if(a>= L && a<= R)
            return true;
        return false;
    }
}
