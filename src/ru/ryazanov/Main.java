package ru.ryazanov;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list = {1, 3, 5, 7, 9};
        System.out.println("{1, 3, 5, 7, 9} : search '3' position is '" + Search.binarySearch(list, 3) + "'");
        System.out.println("{1, 3, 5, 7, 9} : search '6' position is '" + Search.binarySearch(list, 6) + "'");
        System.out.println("Factorial '6' is - " + Recursion.factorial(6));
        System.out.println("Factorial '-1' is - " + Recursion.factorial(-1));
    }
}
