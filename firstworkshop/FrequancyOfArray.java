package firstworkshop;

import java.util.Scanner;

public class FrequancyOfArray {

//	Write a program to FIND HOW MANY TIMES ELEMENT IS OCCURED in a given array?

	static void FrequancyOfArray() {

		int[] arr = { 5, 7, 35, 4, 5, 6, 6, 7, 8, 3, 2, 1 };

		int[] fr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;

					fr[j] = -1;
				}
			}

			if (fr[i] != -1) {
				fr[i] = count;

			}

		}
		for (int i = 0; i < fr.length; i++) {

			if (fr[i] != -1) {
//				System.out.println("Element" + arr[i] + "|" + " " + "Reapt" + fr[i]);
			}
		}

//		int frq[] = new int[arr.length];
//
//		// using each for loop
//		for (int e : arr) {
//
//			frq[e]++;
//			
//			
//			
//		}
//		// calculate the fequancy
//		for (int i = 0; i < frq.length; i++) {
//			if (frq[i] > 0) {
//				System.out.println("Element" + i + "  " + "Time" + frq[i]);
//			}
//
//		}
//		System.out.println("******************************");

	}

//	1> Prime Number
//	Just like the Perfect number, the Prime number is also a special type of number. When
//	the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//	number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//	divided by 2, so 2 is the only even prime minister.

	static void primeNumber() {

		int data = 10;

		int evennumber = data / 2;

		if (evennumber == 0 || evennumber == 1) {

			System.out.println(evennumber + " " + "It is not prime number");
		} else if (evennumber == 2) {
			System.out.println(evennumber + " " + "Is a prime minister number");
		} else {
			System.out.println(evennumber + " " + "Is a prime  number");
		}
	}

	public static void main(String[] args) {
		FrequancyOfArray();
		primeNumber();
	}
}
