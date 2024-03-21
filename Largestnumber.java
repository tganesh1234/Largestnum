package gani.assignments;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// find largest number among the 3 numbers
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 3 numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a>b) {
			if (a>c) {
				System.out.println(a+" is the largest number.");
			}else {
				System.out.println(c+" is the largest number.");
			}
		}else if(b>c) {
			System.out.println(b+" is the largest number.");
		}else {
			System.out.println(c+" is the largest number.");
		}

	}

}
