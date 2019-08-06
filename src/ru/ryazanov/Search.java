package ru.ryazanov;

class Search {
    static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = (high + low) / 2;
            int guess = list[middle];

            if (guess == item) {
                return middle;
            }else if (guess > item) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }

        }

        return Integer.MIN_VALUE;
    }
}
