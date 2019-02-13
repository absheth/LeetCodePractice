import java.util.*;
import java.io.*;

class BinarySearchTree {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("----- Starting -----");
        System.out.println();
        int A[] = { 4, 6, 7, 11, 13, 13, 14, 18, 19, 21, 25, 25, 26, 26, 26,
            30, 32, 32, 34, 36, 39, 42, 44, 47, 47, 47, 49};
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
                );

        System.out.println("Enter the number whose index you find.");
        System.out.println("Enter x to end.");

        int element;
        String s;
        s = br.readLine();
        while (!s.equalsIgnoreCase("x")){
            try {
                element = Integer.parseInt(s);
                int startIndex = 0;
                int endIndex = A.length - 1;
                int mid = (startIndex + endIndex) / 2;
                while (A[mid] != element && startIndex <= endIndex) {
                    if (A[mid] < element) {
                        startIndex = mid+1;
                    } else {
                        endIndex = mid-1;
                    }
                    mid = (startIndex + endIndex) / 2;
                }
                if (A[mid] == element) {
                    System.out.println("Element index: " + mid);
                } else {
                    System.out.println("Element is not present in the array.");
                }
                System.out.println("--------------------------------------");

                System.out.println();
                System.out.println("Enter the number whose index you find.");
                System.out.println("Enter x to end.");
                s = br.readLine();


            } catch (Exception e) {

                System.out.println("--------------------------------------");
                System.out.println("Enter the number whose index you find.");
                System.out.println("Enter x to end.");
                s = br.readLine();
            }
        }

    }

}

/*  int ALength = 27;
 *  int A[] = new int[ALength];
 *  for (int i = 0; i < A.length; i++) {
 *      A[i] = (int) (Math.random() * 49) + 1;
 *  }
 *
 *  System.out.println("Before sorting: ");
 *  for (int i = 0; i < A.length; i++) {
 *      System.out.print(A[i] + " ");
 *  }
 *  System.out.println();
 *
 *  Arrays.sort(A);
 *
 *  System.out.println("After sorting: ");
 *
 *  System.out.print("A = [");
 *  for (int i = 0; i < A.length; i++) {
 *      System.out.print(A[i] + (i!=A.length-1?", ":"]"));
 *  }
 * System.out.println();
 *
 *
 *
 *
 * */
