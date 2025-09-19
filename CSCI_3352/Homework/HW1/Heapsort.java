package CSCI_3352.Homework.HW1;

import java.util.Arrays;

public class Heapsort {
    public static int[] BUILD_MAX_HEAP(int[] arr, int n){
        for (int i = n/2;i>=0;i--){
            System.out.println(String.format("MAX_HEAPIFY(arr,%d,%d)",i,n));
            arr = MAX_HEAPIFY(arr,i,n);
            System.out.print("\t");
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] MAX_HEAPIFY(int[] arr, int i, int n){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = i;
        if (l <= n && arr[l] > arr[largest]){ largest = l;}
        if (r <=n && arr[r] > arr[largest]) {largest = r;}

        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            System.out.print("\t" + String.format("exchange A[%d] with A[%d]",i,largest));
            System.out.println(Arrays.toString(arr));
            return MAX_HEAPIFY(arr,largest,n);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] testArr = {4,1,3,2,16,9,10,14,8,7};
        BUILD_MAX_HEAP(testArr,testArr.length-1);
    }
}
