package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        
        System.out.println("Enter array elements to rotate : ");
        int arr[] = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter k element : ");
        int k = sc.nextInt();
        
        System.out.println("Rotated Array is : ");
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        rotateArray(arr, 0, n - 1); // Reverse the whole array
        rotateArray(arr, 0, k - 1); // Reverse the first k elements
        rotateArray(arr, k, n - 1); // Reverse the rest of the array
    }

    public static void rotateArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
