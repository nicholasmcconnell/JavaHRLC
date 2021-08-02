package com.QC;

import java.util.Arrays;

public class BinarySearch {

//input
//int K = 55;
//int[] A = {90,43,27,20,42,84,39,96,75,1,58,49,77,40,28,38,55,17,53,33,68,57,7,56,78,77,68,99,82,41,26,64,69,1,98,98,63,15,13,95,23,71,6,57,4,10,10,44,11,84,10,59,62,94,49,17};
//Expected Output 18

// Input
//int K = 81;
//int[] A = {59,53,2,54,62,25,35,79,64,27,49,32,95,100,20,58,39,92,30,67,89,58,81,100,66,73,29,75,81,70,55,18,28,7,35,98,52,30,11,69,48,84,54,13,14,15,86,34,82,92,26,8,53,62,57,50,31,61,85,88,5,80,64,90,52,47,43,40,93,69,70,16,43,7,25,99,12,63,99,71,76,58};
//Expected Output 60

// Input
//int K = 22;
//int[] A = {26,45,72,81,47,29,97,2,75,25,82,84,17,56,32,2,28,37,57,39,18,11,75};
//Expected Output 76

    public static void main(String[] args) {
        int[] A = {26, 45, 72, 81, 47, 29, 97, 2, 75, 25, 82, 84, 17, 56, 32, 2, 28, 37, 57, 39, 18, 11, 75, 19, 20,21,22,23,24};
        int K = 97;
        System.out.println(binarySearchNot(A, K));
//        System.out.println(binarySearch(A, K));

    }


    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(int[] array, int K) {
        Arrays.sort(array);

        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;



        while (first <= last) {
            mid = (first + last) / 2;
            System.out.println(array[mid]);

            // Check if x is present at mid
            if (array[mid] == K) {
                System.out.println("element found");
                return array[mid];
            }

            // If x greater, ignore left half
            if (array[mid] < K) {
                first = mid + 1;
                // If x is smaller, ignore right half
            } else {
                last = mid - 1;
            }
            ;


            if (first > last) {
                System.out.println("element not found");
            }
        }

//        while( first <= last ){
//            if ( arr[mid] < key ){
//                first = mid + 1;
//            }else if ( arr[mid] == key ){
//                System.out.println("Element is found at index: " + mid);
//                break;
//            }else{
//                last = mid - 1;
//            }
//            mid = (first + last)/2;
//        }
//        if ( first > last ){
//            System.out.println("Element is not found!");
//        }


        return -1;
    }


    static int binarySearchNot(int[] array, int K) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int first = 0;
        int last = array.length - 1;

        if(K == array[last])
        {
            return K+1;
        }


        while (first <= last) {

            int mid = (first + last) / 2;
            System.out.println(array[mid]);

            //check if mid == K
                //Helper Function
                //if yes => check next element to be K++
                    //if no return K++
                    //if yes add one to K again and check next element
            if(array[mid] == K && (K+1) != array[mid+1]){
                return K+1;
            }

            if(array[mid] == K && (K+1) == array[mid+1]){
                K = array[mid+1];
                for (int i = mid+2; i<last; i++){
                    if (K+1 != array[i]){
                       return K+1;
                    } else{
                        K++;
                    }
                }
            }

            //check if mid is less than K
                //Yes?
                //ignore all to left
                //make first = mid +1
            if(array[mid] < K){
                first = mid + 1;
            }

            //check if mid is greater than K
                //ingore all to right
                //make last = mid -1;
            if(array[mid] > K){
                last = mid-1;
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= K) continue;

            if (array[i] > K && array[i] != K + 1) {
                return K + 1;
            }

            if (array[i] > K && array[i] == K + 1) {
                K = array[i];
            }

        }

        return 0;
    }

}
