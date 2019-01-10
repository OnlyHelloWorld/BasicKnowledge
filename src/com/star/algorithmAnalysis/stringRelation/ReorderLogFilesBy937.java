/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  ReorderLogFilesBy937.java   
 * @Package com.star.algorithmAnalysis.stringRelation   
 * @Description:  leetcode937��,��Ϥ�ַ����ȽϷ���
 * @author: ����16��ͨ 
 * @date:   2019��1��10�� ����11:05:45   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.algorithmAnalysis.stringRelation;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**   
 * @ClassName:  ReorderLogFilesBy937   
 * @Description:����־�ļ���������
 * 				����ÿ����־�����һ����Ϊ��ĸ���ֱ�ʶ����Ȼ��Ҫô��
				��ʶ�������ÿ���ֽ�����Сд��ĸ��ɣ���
				��ʶ�������ÿ���ֽ�����������ɡ�
				���ǽ���������־�ֱ��Ϊ��ĸ��־��������־����֤ÿ����־�����ʶ������������һ���֡�
				����־��������ʹ��������ĸ��־������������־֮ǰ����ĸ��־����ĸ˳�����򣬺��Ա�ʶ������ʶ�������ڱ�ʾ��ϵ��������־Ӧ�ð�ԭ����˳�����С�
 * 				���룺["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
				�����["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * @author: ����16��ͨ
 * @date:   2019��1��10�� ����11:05:45   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class ReorderLogFilesBy937 {
	
	/**   
	 * @Title: reorderLogFiles   
	 * @Description: ��⺯��  
	 * @param: @param logs ��Ҫ����ķ���
	 * @param: @return      
	 * @return: String[]  ����֮�������    
	 * @throws   
	 */
	public static String[] reorderLogFiles(String[] logs) {
		
		List<String> letterLogs = new LinkedList<>();
		List<String> digitLogs = new LinkedList<>();
		for (String string : logs) {
			
			char c = string.charAt(string.indexOf(" ")+1);  //�õ���һ��" "֮����ַ�
			if (c >= 48 && c <= 57) {                       //���������
				digitLogs.add(string);
			} else {
				letterLogs.add(string);
			}
		}
		
		//����ؼ���ϰ��
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
