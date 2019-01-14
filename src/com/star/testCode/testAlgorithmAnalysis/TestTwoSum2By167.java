/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  TestTwoSum2By167.java   
 * @Package com.star.testCode.testAlgorithmAnalysis   
 * @Description:    TODO 
 * @author: 吉大16沈通 
 * @date:   2019年1月13日 下午9:15:01   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testAlgorithmAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.algorithmAnalysis.doublePointer.TwoSum2By167;

/**   
 * @ClassName:  TestTwoSum2By167   
 * @Description:TODO
 * @author: 吉大16沈通
 * @date:   2019年1月13日 下午9:15:01   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TestTwoSum2By167 {

	@Test
	public void test() {
			int[] numbers = {2, 7, 11, 15};
			int target = 9;
			int[] twoSum = TwoSum2By167.twoSum(numbers, target);
			for (int i : twoSum) {
				System.out.println(i);
			}
	
	}

}
