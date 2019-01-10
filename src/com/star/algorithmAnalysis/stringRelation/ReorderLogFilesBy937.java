/**  
 * All rights Reserved, Designed By 吉大16沈通
 * @Title:  ReorderLogFilesBy937.java   
 * @Package com.star.algorithmAnalysis.stringRelation   
 * @Description:  leetcode937题,熟悉字符串比较方法
 * @author: 吉大16沈通 
 * @date:   2019年1月10日 下午11:05:45   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.stringRelation;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**   
 * @ClassName:  ReorderLogFilesBy937   
 * @Description:对日志文件重新排序
 * 				对于每条日志，其第一个字为字母数字标识符。然后，要么：
				标识符后面的每个字将仅由小写字母组成，或；
				标识符后面的每个字将仅由数字组成。
				我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
				将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，标识符仅用于表示关系。数字日志应该按原来的顺序排列。
 * 				输入：["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
				输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * @author: 吉大16沈通
 * @date:   2019年1月10日 下午11:05:45   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ReorderLogFilesBy937 {
	
	/**   
	 * @Title: reorderLogFiles   
	 * @Description: 求解函数  
	 * @param: @param logs 需要传入的分组
	 * @param: @return      
	 * @return: String[]  处理之后的数组    
	 * @throws   
	 */
	public static String[] reorderLogFiles(String[] logs) {
		
		List<String> letterLogs = new LinkedList<>();
		List<String> digitLogs = new LinkedList<>();
		for (String string : logs) {
			
			char c = string.charAt(string.indexOf(" ")+1);  //得到第一个" "之后的字符
			if (c >= 48 && c <= 57) {                       //如果是数字
				digitLogs.add(string);
			} else {
				letterLogs.add(string);
			}
		}
		
		//本题关键练习点
		letterLogs.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String log1 = o1.substring(o1.indexOf(" "));
				String log2 = o2.substring(o2.indexOf(" "));
				return log1.compareTo(log2);
			}
		});
		
		letterLogs.addAll(digitLogs);
        return letterLogs.toArray(logs);
    }

}
