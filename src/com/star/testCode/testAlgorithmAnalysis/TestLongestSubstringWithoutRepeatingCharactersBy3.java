/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  TestLongestSubstringWithoutRepeatingCharactersBy3.java   
 * @Package com.star.testCode.testAlgorithmAnalysis   
 * @Description:    TODO 
 * @author: ����16��ͨ 
 * @date:   2018��12��26�� ����2:43:52   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testAlgorithmAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.algorithmAnalysis.slidingWindow.LongestSubstringWithoutRepeatingCharactersBy3;

/**   
 * @ClassName:  TestLongestSubstringWithoutRepeatingCharactersBy3   
 * @Description:TODO
 * @author: ����16��ͨ
 * @date:   2018��12��26�� ����2:43:52   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TestLongestSubstringWithoutRepeatingCharactersBy3 {

	@Test
	public void test() {
		String s = "abad";
		System.out.println(LongestSubstringWithoutRepeatingCharactersBy3.lengthOfLongestSubstring(s));
	}

}
