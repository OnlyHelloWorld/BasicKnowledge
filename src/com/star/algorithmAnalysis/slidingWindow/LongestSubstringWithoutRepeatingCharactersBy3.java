/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  LongestSubstringWithoutRepeatingCharactersBy3.java   
 * @Package com.star.algorithmAnalysis.slidingWindow   
 * @Description: ���ڻ������������㷨 .
 * @author: ����16��ͨ .
 * @date:   2018��12��26�� ����12:01:12   
 * @version V1.0 
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.slidingWindow;import java.util.HashSet;
import java.util.Set;

/**   
 * @ClassName:  LongestSubstringWithoutRepeatingCharactersBy3   
 * @Description:����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�.
 * @author: ����16��ͨ
 * @date:   2018��12��26�� ����12:01:12   
 *     
 * @Copyright: 2018 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class LongestSubstringWithoutRepeatingCharactersBy3 {
	
	/**   
	 * @Title: lengthOfLongestSubstring   
	 * @Description: �����ظ��ַ�����Ӵ�,ͨ����������
	  					start =0; end = 0;
						��ʾ�����������߳�ʼλ���Լ���ʼ��С
						֮������ַ���(���������������ʱ)ͨ����ĿҪ��������ڴ�С
						�ڵ���������,ע�Ᵽ��֮ǰ��ֵ,�Ա����ʱȡ�����ֵ(������Сֵ).  
	 * @param: @param s  Դ�ַ���.
	 * @param: @return      
	 * @return: int  ���ظ���Ӵ��ĳ���.
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
