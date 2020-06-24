package com.hk.algorithm;

import java.util.ArrayList;
import java.util.Iterator;

public class E015ArrayList {
	public static void main(String[] args) {
		// ���׸� ���
		ArrayList<String> fruits = new ArrayList<String>();

		// add()�� String ��ü�� ����Ʈ�� �߰�
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");

		// ����ϱ�
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		// Iterator ����ϱ�
		for(Iterator<String> itr = fruits.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
