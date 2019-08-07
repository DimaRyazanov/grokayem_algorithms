package ru.ryazanov;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list = {1, 3, 5, 7, 9};
        int[] list2 = {1, 2, 4, 5, 7, 12, 14, 16, 18};
        System.out.println(Arrays.toString(list) + ": search '3' position is '" + Search.binarySearch(list, 3) + "'");
        System.out.println(Arrays.toString(list) + ": search '6' position is '" + Search.binarySearch(list, 6) + "'");
        System.out.println("Recursion Factorial '6' is - " + Recursion.factorial(6));
        System.out.println("Recursion Factorial '-1' is - " + Recursion.factorial(-1));
        System.out.println("Recursion sum " + Arrays.toString(list) + " is - " + Recursion.sum(list));
        System.out.println("Recursion count elements in " + Arrays.toString(list) + " is - " + Recursion.countElements(list));
        System.out.println("Recursion max in array " + Arrays.toString(list) + " is - " + Recursion.max(list));
        System.out.println("Recursion binary search in " + Arrays.toString(list) + ": search '3' position is '" + Recursion.binarySearch(list, 3) + "'");
        System.out.println("Recursion binary search in " + Arrays.toString(list) + ": search '2' position is '" + Recursion.binarySearch(list, 2) + "'");
        System.out.println("Recursion binary search in " + Arrays.toString(list2) + ": search '16' position is '" + Recursion.binarySearch(list2, 16) + "'");
        System.out.println("Recursion binary search in " + Arrays.toString(list2) + ": search '2' position is '" + Recursion.binarySearch(list2, 2) + "'");

        int[] list3 = {2, 0, 12, 5, 12, 33, 45, 64, 3, 9, 5, 6, 7};
        System.out.println("Recursion quick sort array " + Arrays.toString(list3) + " - " + Arrays.toString(Recursion.quickSort(list3)));

        Set statesNeeded = Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az");
        Map stations = Map.of("kone", Set.of("id", "nv", "ut"),
                            "ktwo", Set.of("wa", "id", "mt"),
                            "kthree", Set.of("or", "nv", "ca"),
                            "kfour", Set.of("nv", "ut"),
                            "kfive", Set.of("ca", "az"));

        System.out.println("Greedy algorithm - find stations: result - " + GreedyAlgorithms.findStations(statesNeeded, stations) + " stations");
    }
}
