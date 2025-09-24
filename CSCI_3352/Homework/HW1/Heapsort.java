package CSCI_3352.Homework.HW1;

import java.util.Arrays;
import java.util.Random;


public class Heapsort {
    public static int[] EXCHANGE(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.printf("\texchange A[%d] witn A[%d]",i,j);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

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
            arr = EXCHANGE(arr,i,largest);
            return MAX_HEAPIFY(arr,largest,n);
        }
        return arr;
    }

    public static int[] HEAPSORT(int[] arr){
        System.out.println("====================================BUILD MAX HEAP====================================");
        int[] heap = BUILD_MAX_HEAP(arr,arr.length-1);
        System.out.println("====================================BEGIN HEAPSORT====================================");
        for (int i = heap.length-1;i>=1;i--){
            System.out.printf("HEAPSORT STEP %d\n",heap.length-i);
            heap = MAX_HEAPIFY(EXCHANGE(heap,0,i), 0, i-1);
        }
        System.out.println("======================================================================================");
        return heap;
    }

    public static int[] CREATE_RANDOM_ARR(int arrSize,int max_value){
        int[] arr = new int[arrSize];
        Random r = new Random();

        for (int i = 0; i<arrSize;i++){
            arr[i] = r.nextInt(max_value+1);
        }
        return arr;
    }


    public static void main(String[] args){
        int[] testArr = {1,1,3,2,16,9,10,14,8,7};
        int[] randomArr = CREATE_RANDOM_ARR(100, 100);
        
        long startTime = System.currentTimeMillis();
        int[] sortedArr = HEAPSORT(randomArr);
        System.out.println(Arrays.toString(sortedArr));
        long endTime = System.currentTimeMillis();
        System.out.printf("%dms\n",endTime - startTime); // Elapsed time in milliseconds
    }
}
