package com.blz.WeeklyReview;

public class NegativeNumbers {
    public static void shiftIntegers(int arr[], int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        System.out.println("Original Array Elements: ");
        int a[] = {2, 4, -10, 13, -7, -60, 52, 8, -19};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        int arr[] = {2, 4, -10, 13, -7, -60, 52, 8, -19};
        int n = arr.length;
        shiftIntegers(arr, n);
        System.out.println();
        System.out.println("Negative Elements at Beginning: ");
        printArray(arr, n);
    }
}
