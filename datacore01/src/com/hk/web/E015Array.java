package com.hk.web;

import java.util.Arrays;
import java.util.Scanner;

public class E015Array {
	public static void main(String[] args) {
		
		// �ִ밪 ���ϱ�
		int[] a = {10, 32, 345, 3410, 304};
		
		
		// �ݺ��� - if ���ǹ� ���
		int max = a[0]; // �ִ밪
		
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) max = a[i];

		}
		System.out.println(max);
		
		// �ٸ� �ݺ��� - Math.max �Լ� ���
		for(int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println(max);
		
		// �ٸ� ��� - �������� ���� ��, �� ������ �迭 �ּҰ� ��ȯ -> �ִ밪
		Arrays.sort(a);
		System.out.println(a[4]);
		
		// �ٸ� ��� - 2���� �迭 �� -> �ִ밪
		System.out.println(Math.max(Math.max(Math.max(Math.max(a[0], a[1]), a[2]), a[3]), a[4]));
		
		// ����
		// �迭�� ��ġ�� ã��
		
		int[] b = {10, 32, 345, 3410, 304};
		int max2 = b[0];
		int index = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(max2 < b[i]) max2 = b[i];
			if(max2 == b[i]) index = i;
		}
		System.out.println(b[index] + " , b[" + index + "]");
		
		// PPT ��
		int[] c = {10, 32, 345, 3410, 304};
		int max3 = 0;
		int index2 = 0;
		
		for(int i = 1; i < c.length; i++) {
			if(c[max3] < c[i]) {
                max3 = i; 
                index2 = i;
			}
		}
		System.out.println(c[max3] + " , " + (index2 + 1) + "��° ����");
		
		// �ּҰ��� ��ġ�� ���ϱ�
		int[] d = {10, 32, 345, 3410, 304};
		int min = d[0];
		int index3 = 0;
		
		for(int i = 0; i < d.length; i++) {
			if(min > d[i]) min = d[i];
			if(min == d[i]) index3 = i;
			
		}
		System.out.println(min + " , �ε����� : " + index3);
		
		// �ּҰ��� ��ġ�� ���ϱ� (�ڵ� ���̱�)
		int min2 = 0;
		for(int i = 0; i < d.length; i++) {
			if(d[min2] > d[i]) min2 = i;
		}
		System.out.println(d[min2] + " , �ε����� : " + min2);
		
		// �ٸ� �ݺ��� - Math.min �Լ� ���
		for(int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println(min);
		
		// �ٸ� ��� - �������� ���� ��, �� ó�� �迭 �ּҰ� ��ȯ -> �ּҰ�
		Arrays.sort(d);
		System.out.println(a[0]);
		
		// �ٸ� ��� - 2���� �迭 �� -> �ּҰ�
		System.out.println(Math.min(Math.min(Math.min(Math.min(d[0], d[1]), d[2]), d[3]), d[4]));
		
		  Scanner scan = new Scanner(System.in);
	      System.out.print("�迭�� ���� �Է�:");
	      int n = scan.nextInt();
	      int[] arr = new int[n];      


	      System.out.println("�迭�� �Է�: ");
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = scan.nextInt();
	      }

	      int maxx = arr[0];
	      int minn = arr[0];
	      
	      for (int i = 0; i < arr.length; i++) {
	         if (max < arr[i]) {
	            max = arr[i];
	         } 
	      }
	      
	      for (int i = 0; i < arr.length; i++) {
	         if (min > arr[i]) {
	            min = arr[i];
	         } 
	      }
	      System.out.print("�ִ�: " + maxx + "\n�ּҰ�: " + minn);

		
		
	}
}
