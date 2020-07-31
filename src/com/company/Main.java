package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	String str = sc1.nextLine();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if (n > str.length()-1) {
		System.out.println("Элемента с таким нмером нет");
	}
	char[] st = str.toCharArray();
	char s;
	String str1 = "";
	for (int i = 0; i < st.length; i++) {
	    if (i != n) {
			str1 += st[i];
		}
    }
	System.out.print(str1);
    }
}
