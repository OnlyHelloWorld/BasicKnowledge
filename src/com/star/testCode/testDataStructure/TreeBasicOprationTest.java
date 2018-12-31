/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  TreeBasicOprationTest.java   
 * @Package com.star.testCode.testDataStructure   
 * @Description: ������������������. 
 * @author: ����16��ͨ 
 * @date:   2018��12��31�� ����7:36:00   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testDataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.dataStructure.BinaryTree.BuildTree;
import com.star.dataStructure.BinaryTree.SearchTreeOpration;
import com.star.dataStructure.BinaryTree.TreeNode;

/**   
 * @ClassName:  TreeBasicOprationTest   
 * @Description:��������������������.
 * @author: ����16��ͨ
 * @date:   2018��12��31�� ����7:36:00   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TreeBasicOprationTest {

	@Test
	public void test() {
		int[] arr = {4,1,2,3,5,6,7};
		TreeNode binTreeRoot = BuildTree.buildBinTree(arr);
		TreeNode binSearchTreeRoot = BuildTree.buildBinarySearchTree(arr);
		SearchTreeOpration.traverseInOrder(binTreeRoot);
		System.out.println();
		SearchTreeOpration.stackTraversalInOrder(binTreeRoot);
		System.out.println("++++++++++++++++++++++++++++++++++");
		SearchTreeOpration.traverseInOrder(binSearchTreeRoot);
		System.out.println("++++++++++++++++++++++++++++++++++");
		SearchTreeOpration.traversePostOrder(binTreeRoot);
		System.out.println();
		SearchTreeOpration.stackTraversalPostOrder(binTreeRoot);           //�˺���δʵ��.
		System.out.println("++++++++++++++++++++++++++++++++++");
		SearchTreeOpration.traversePostOrder(binSearchTreeRoot);
		System.out.println("++++++++++++++++++++++++++++++++++");
		SearchTreeOpration.traversePreOrder(binTreeRoot);
		System.out.println();
		SearchTreeOpration.stackTraversalPreOrder(binTreeRoot);
		System.out.println();
		SearchTreeOpration.queueLayerOrder(binTreeRoot);
		System.out.println("++++++++++++++++++++++++++++++++++");
		SearchTreeOpration.traversePreOrder(binSearchTreeRoot);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

}
