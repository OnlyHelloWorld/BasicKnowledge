/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  TestReorderLogFilesBy937.java   
 * @Package com.star.testCode.testAlgorithmAnalysis   
 * @Description:    TODO 
 * @author: 吉大16沈通 
 * @date:   2019年1月10日 下午11:39:31   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.testCode.testAlgorithmAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.star.algorithmAnalysis.stringRelation.ReorderLogFilesBy937;

/**   
 * @ClassName:  TestReorderLogFilesBy937   
 * @Description:TODO
 * @author: 吉大16沈通
 * @date:   2019年1月10日 下午11:39:31   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TestReorderLogFilesBy937 {

	@Test
	public void test() {
		String[] strings = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		String[] reorderLogFiles = ReorderLogFilesBy937.reorderLogFiles(strings);
		for (String string : reorderLogFiles) {
			System.out.println(string);
		}
	
	}

}
