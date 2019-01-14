/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  TwoSum2By167.java   
 * @Package com.star.algorithmAnalysis.doublePointer   
 * @Description:  利用双指针求解的一道题(167. Two Sum II - Input array is sorted)
 * @author: 吉大16沈通 
 * @date:   2019年1月13日 下午8:58:44   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.doublePointer;

/**   
 * @ClassName:  TwoSum2By167   
 * @Description:给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
				函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
				说明:
				返回的下标值（index1 和 index2）不是从零开始的。
				你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
				示例:
				输入: numbers = [2, 7, 11, 15], target = 9
				输出: [1,2]
				解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * @author: 吉大16沈通
 * @date:   2019年1月13日 下午8:58:44   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class TwoSum2By167 {

	/**   
	 * @Title: twoSum   
	 * @Description: 两个指针分别指向数组两端,如果小于目标值左指针向前移动,大于则右指针向后移动.   
	 * @param: @param numbers  传入数组.
	 * @param: @param target   目标值.
	 * @param: @return      
	 * @return: int[]   返回下标结果数组   
	 * @throws   
	 */
	public static int[] twoSum(int[] numbers, int target) {
		
		int i = 0,j = numbers.length-1;
		
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum == target) {
				return new int[]{i+1,j+1};
			}
			if (sum < target) {
				i++;
			}else {
				j--;
			}
		}
		
        return null;
    }
	
}
