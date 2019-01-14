/**  
 * All rights Reserved, Designed By ����16��ͨ
 * @Title:  Singleton.java   
 * @Package com.star.designPattern.creational   
 * @Description:  ���������ģʽ 
 * @author: ����16��ͨ 
 * @date:   2019��1��14�� ����7:13:38   
 * @version V1.0 
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved.
 */
package com.star.designPattern.creational;

import javax.sound.midi.Synthesizer;

/**   
 * @ClassName:  Singleton   
 * @Description:������:�������ģʽ
 * 				��������:
 * 				˽�еľ�̬����
 * 				˽�еĹ��캯��
 * 				�����ɷ��ʵľ�̬����
 * 				ע:instance�б�Ҫʹ��volatile�ؼ�������,��ֹjvmָ������
 * @author: ����16��ͨ
 * @date:   2019��1��14�� ����7:13:38   
 *     
 * @Copyright: 2019 https://github.com/OnlyHelloWorld Inc. All rights reserved. 
 */
public class Singleton {
	
	//����ʽ,�̲߳���ȫ,������߳̽���if(instance == null)�ж�ʱ
	/*private static Singleton instance;			//˽�еľ�̬����
	
	//˽�еĹ��캯��
	private Singleton() {
		
	}
	
	//�����ɷ��ʵľ�̬����
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/
	
	
	//����ʽ,�̰߳�ȫ
	/*private static Singleton instance = new Singleton();    //˽�еľ�̬����
	
	//˽�еĹ��캯��
	private Singleton() {

	}
	
	//�����Ŀɷ��ʵľ�̬����
	public static Singleton getInstace() {
		return instance;
	}*/
	
	//����ʽ,�����̰߳�ȫ,ͨ��synchronized�ؼ�������֤
	/*private static Singleton instance;			//˽�еľ�̬����
	
	//˽�еĹ��캯��
	private Singleton() {

	}
	
	//�����Ŀɷ��ʵľ�̬����
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/
	
	//����ʽ˫����֤,�̰߳�ȫ,ֻ��ʵ����������м���,����֮�����һ�ηǿ��ж�
	/*private static Singleton instance;			//˽�еľ�̬����
	
	//˽�еĹ��췽��
	private Singleton() {
		
	}
	
	//�����Ŀɷ��ʵľ�̬����
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}*/
	
	//��̬�ڲ���ʵ��,�Ⱦ����ӳټ��ص�����,jvm���ܱ�֤�̰߳�ȫ
	//�ڲ�������ʵ��
	private static class InstanceHolder{
		public static Singleton instance = new Singleton();
	}

	//˽�еĹ��캯��
	private Singleton() {

	}
	//�����Ŀɷ��ʵľ�̬����
	public static Singleton getInstance() {
		return InstanceHolder.instance;
	}
	
	/*
	 * ͨ��ö��ʵ��
	 * public enum Singleton{
	 * 		INSTANCE;
	 * }
	 * */

}
