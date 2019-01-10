/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  RangeSumOfBSTBy938Test.java   
 * @Package com.star.testCode.testDataStructure   
 * @Description:   测试RangeSumOfBSTBy938
 * @author: 吉大16沈通 
 * @date:   2019年1月1日 下午1:19:30   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testDataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.dataStructure.BinaryTree.BuildTree;
import com.star.dataStructure.BinaryTree.RangeSumOfBSTBy938;
import com.star.dataStructure.BinaryTree.TreeNode;

/**   
 * @ClassName:  RangeSumOfBSTBy938Test   
 * @Description:测试leetcode938(RangeSumOfBSTBy938Test)
 * @author: 吉大16沈通
 * @date:   2019年1月1日 下午1:19:30   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class RangeSumOfBSTBy938Test {

	@Test
	public void test() {
		int[] arr = {4,2,1,3,6,5,7};
		TreeNode root = BuildTree.buildBinarySearchTree(arr);
		int bst = RangeSumOfBSTBy938.rangeSumBST(root, 1, 7);
		System.out.println(bst);
	}

}
