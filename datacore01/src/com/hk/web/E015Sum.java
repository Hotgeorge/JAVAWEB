package com.hk.web;

import java.util.Scanner;

public class E015Sum {
	public static void main(String[] args) {
		
		// ���α׷����̶� ? � ������ ������ ������ ������ Ǯ�� �ȴ�.
		Scanner stdIn = new Scanner(System.in);
		 System.out.print("n�� �� : "); // ����ڿ��� ����
		 int n = stdIn.nextInt();
		 
		 int sum = 0;
		 
		 // �ݺ���
		 for(int i = 1; i <= n; i++) {
			 sum += i; // sum = sum + i;
		 }
		 System.out.println("1���� " + n + "������ ���� " + sum);
		 
		 // ���콺
		 sum = n * (n+1) / 2;
		 
		 System.out.println("1���� " + n + "������ ���� " + sum);
		 
		 
		 sum = 0;
		 
		 // �ݺ���
		 for(int i = 1; i <= n; i++) {
			 sum += i*i;
		 }
		 System.out.println("1���� " + n + "������ ���� " + sum);
		
		 // Math.pow(n, 2) = n*n;
		 sum = 0;
		 for(int i = 1; i <= n; i++) {
			 sum += Math.pow(i, 2); // i * i
		 }
		 System.out.println("1*1���� " + n + " * " + n + "������ ���� : " + sum);
		 
		 // �ٸ� ���
		 sum = n * (n+1) * (2*n+1) / 6;
		 System.out.println("1*1���� " + n + " * " + n + "������ ���� : " + sum);
		 
		 // 10���� ������ �Է��ؼ� �迭�� �����
		 // 3�� ������� ����Ͻÿ�
		 
		 int[] a = new int[10];
		 for(int i = 1; i < a.length; i++) {
			 System.out.print("������ �Է��Ͻÿ� : ");
			 a[i] =stdIn.nextInt();
		 }
		 
		 for(int i = 1; i < a.length; i++) {
			 if(a[i]%3==0) {
				 System.out.print(a[i] + " ");
			 }
		 }			
	}
}
