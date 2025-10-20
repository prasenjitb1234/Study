package javastudy.practice.one;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index: " + i);
                status = true;
                break;
            }
        }

        if (!status) {
            System.out.println(target + " not found in the array!");
        }

        sc.close();
    }
}
