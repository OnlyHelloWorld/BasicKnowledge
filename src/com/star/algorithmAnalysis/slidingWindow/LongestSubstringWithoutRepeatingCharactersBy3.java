/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  LongestSubstringWithoutRepeatingCharactersBy3.java   
 * @Package com.star.algorithmAnalysis.slidingWindow   
 * @Description: 基于滑动窗口求解的算法 .
 * @author: 吉大16沈通 .
 * @date:   2018年12月26日 下午12:01:12   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.slidingWindow;import java.util.HashSet;
import java.util.Set;

/**   
 * @ClassName:  LongestSubstringWithoutRepeatingCharactersBy3   
 * @Description:给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。.
 * @author: 吉大16沈通
 * @date:   2018年12月26日 下午12:01:12   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LongestSubstringWithoutRepeatingCharactersBy3 {
	
	/**   
	 * @Title: lengthOfLongestSubstring   
	 * @Description: 求无重复字符的最长子串,通过滑动窗口
	  					start =0; end = 0;
						表示滑动窗口两边初始位置以及初始大小
						之后遍历字符串(或者链表或者数组时)通过题目要求调整窗口大小
						在调整过程中,注意保存之前的值,以便结束时取得最大值(或者最小值).  
	 * @param: @param s  源字符串.
	 * @param: @return      
	 * @return: int  无重复最长子串的长度.
	 * @throws   
	 */
	public static int lengthOfLongestSubstring(String s) {
		
		int len = s.length();
		int res = 0;
		int start = 0;  int end = 0;
		Set<Character> set = new HashSet<>();
		while (start<len && end <len) {
			if (set.contains(s.charAt(end))) {
				set.remove(s.charAt(start++));
			}else {
				set.add(s.charAt(end++));
				res = Math.max(res, end -start);
			}
		}
		
        return res;
    }
	
	
}
