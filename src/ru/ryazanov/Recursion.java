package ru.ryazanov;
import java.util.Arrays;

class Recursion {
    static long factorial(long x) {

        if (x < 1) {
            return 0;
        }

        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    static int sum(int[] data) {
        if (data.length == 0) {
            return 0;
        }

        return data[0] + sum(copyOfRange(data, 1, data.length));
    }

    static int countElements(int[] data) {
        if (data.length == 0) {
            return 0;
        }

        return 1 + countElements(copyOfRange(data, 1, data.length));
    }

    static int max(int[] data) {
        if (data.length == 0) {
            return 0;
        }

        int max = data[0];
        int max_another = max(copyOfRange(data, 1, data.length));
        if (max_another > max) {
            return max_another;
        }else {
            return max;
        }
    }

    static int binarySearch(int[] data, int item) {
        if (data.length == 0) {
            return Integer.MIN_VALUE;
        }
        int position = (data.length - 1) / 2;
        if (data[position] == item) {
            return position;
        }else if (data[position] > item) {
            return binarySearch(copyOfRange(data, 0, position), item);
        }else if (data[position] < item) {
            return position + (binarySearch(copyOfRange(data, position + 1, data.length), item) + 1);
        }

        return Integer.MIN_VALUE;
    }

    static int[] quickSort(int[] data) {
        if (data.length < 2) {
            return data;
        }

        int pivot = data[0];
        int lessSize = 0;
        int greaterSize = 0;

        int[] less = new int[data.length - 1];
        int[] greater = new int[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            if (data[i] <= pivot) {
                less[lessSize++] = data[i];
            } else {
                greater[greaterSize++] = data[i];
            }
        }
        return appentTwoArraysAndValue(quickSort(copyOfRange(less, 0, lessSize)), pivot, quickSort(copyOfRange(greater, 0, greaterSize)));
    }

    private static int[] copyOfRange(int[] data, int from, int to) {
        int[] result = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            result[index++] = data[i];
        }

        return result;
    }

    private static int[] appentTwoArraysAndValue(int[] lessData, int value, int[] greaterData) {
        int[] result = new int[lessData.length + greaterData.length + 1];

        for (int i = 0; i < lessData.length; i++) {
            result[i] = lessData[i];
        }

        result[lessData.length] = value;

        for (int i = 0; i < greaterData.length; i++) {
            result[lessData.length + i + 1] = greaterData[i];
        }

        return result;
    }
}
