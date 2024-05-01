package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int position = 0;
        while (position < data.length){
            if (position == 0 || data[position].compareTo(data[position - 1]) >= 0) {
                position = position + 1;
            }
            else {
                swap(data, position, position - 1);
                position = position - 1;
            }

        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
        boolean swapped;
        int start = 0;
        int end = data.length - 2;
        do
        {
            swapped = false;
            // Forward pass (from left to right)
            for (int i = start; i <= end; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }

        // Backward pass (from right to left)
            swapped = false;
            for (int i = end; i >= start; i--) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
        }while (swapped);
    }


    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





