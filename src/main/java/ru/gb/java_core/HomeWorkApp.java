package ru.gb.java_core;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        createIntArr();
        createFillArr();
        modifyArr();
        printSquareArr();
        initialArr(10, 5);
        maxMinNumber();
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        changeElementsArr(new int[] {1, 2, 3}, -1);
    }

    public static void createIntArr() {

        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void createFillArr() {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void modifyArr() {

        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void printSquareArr() {

        System.out.println();

        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == 10 - 1) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int[] tmp : arr) {
            System.out.println(Arrays.toString(tmp));
        }

    }

    public static int[] initialArr(int len, int initialValue) {

        if (len < 0) {
            len = 0;
        }

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static void maxMinNumber() {

        int[] arr = new int[] {5, 7, 3, 2, 8, 11, 9};

        int maxNumber = 0;
        int minNumber = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }

            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }

        }

        System.out.printf("Минимум = %d, максимум = %d", minNumber, maxNumber);

    }

    public static boolean checkBalance(int[] arr) {

        System.out.println();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];

            if (sum == sumOfElements(arr, i)) {
                return true;
            }

        }

        return false;
    }

    public static int sumOfElements(int[] arr, int iterator) {

        int sum = 0;

        for (int i = arr.length - 1; i > iterator; i--) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void changeElementsArr(int[] arr, int shift) {

        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int len = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[0] = len;

            }

        } else {
            for (int i = 0; i > shift; i--) {
                int len = arr[0];

                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[arr.length - 1] = len;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
