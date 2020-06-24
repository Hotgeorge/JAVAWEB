package com.hk.bookexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Exam6_13 {
	public static void main(String[] args) {
		
		// 6�� ����
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);
		
		// 7�� ����
		String str2 = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str2.indexOf("�ڹ�");
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str2 = str2.replace("�ڹ�", "Java");
			System.out.println("-->" + str2);
		}
		
		System.out.println();
		
		// 8�� ����
		String str3 = "���̵�,�̸�,�н�����";
		
		// ��� 1(split() �޼ҵ� �̿�)
		String[] res = str3.split(",");
		for(String result : res) {
			System.out.println(result);
		}
		
		System.out.println();
		
		// ��� 2(StringTokenizer �̿�)
		StringTokenizer sttz =  new StringTokenizer(str3, ",");
		
		while(sttz.hasMoreTokens()) {
			System.out.println(sttz.nextToken());
		}
		
		// 9�� ����
		String str4 = "";
		for(int i=1; i<=100; i++) {
			str4 += i;
		}
		System.out.println(str4);
		
		// ���� �ڵ� �ۼ� ��ġ
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		
		// 10�� ����
		String id = "5Angel1004";
		String regExp = "\\d\\w{5}\\d{4}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		else System.out.println("ID�� ����� �� �����ϴ�.");
		
		// 11�� ����
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		// �ڽ̵� int ���� ������ -128 ~ 127 �̱� ������ ���� 300�̸� ��ڽ��� ���� ���� �̾�����Ѵ�.
		System.out.println(obj3.intValue() == obj4.intValue());
		
		// 12�� ����
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(intData1 + " " + strData2);
		
		// 13�� ����
		Date now = new Date();
		
		// ���⼭ �ڵ带 �ۼ��ϼ���.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));
	}
}
