package CSCI_3352.Homework.HW1;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
     
    public static int[] EXCHANGE(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //System.out.printf("\texchange A[%d] witn A[%d]",i,j);
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static Object[] PARTITION(int[] arr, int p, int r){
        //r is the last value, p is the starting value
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++){
            if (arr[j] <= x){
                i= i+1;
                arr = EXCHANGE(arr,i,j);
            }
        }
        arr = EXCHANGE(arr,i+1,r);
        return new Object[]{arr,i+1};
    }
    
    public static int[] QUICKSORT(int[] arr, int p, int r, int count){
        // 'count' is the recursion counter to determine the number of tabs to use in the prints 

        //int[] sliced = Arrays.copyOfRange(arr, p, r+1);
        //System.out.printf("\t".repeat(count)+"QUICKSORT("+Arrays.toString(sliced)+", %d, %d)\n",p,r);

        if (p < r){
            Object[] partition_result = PARTITION(arr, p, r);
            arr = (int[]) partition_result[0];
            int q = (int) partition_result[1];
            //sliced = Arrays.copyOfRange(arr, p, r+1);
            //System.out.println("\t".repeat(count)+"Partitioned = "+Arrays.toString(sliced)+"q =" );
            arr = QUICKSORT(arr,p,q-1,count+1);
            arr = QUICKSORT(arr,q+1,r,count+1);
        }
        //sliced = Arrays.copyOfRange(arr, p, r+1);
        //System.out.println("\t".repeat(count)+"QUICKSORT = "+Arrays.toString(sliced));
        return arr;
    }

    public static int[] CREATE_RANDOM_ARR(int arrSize,int max_value){
        int[] arr = new int[arrSize];
        Random r = new Random();

        for (int i = 0; i<arrSize;i++){
            arr[i] = r.nextInt(max_value+1);
        }
        return arr;
    }

    public static void main (String[] args){
        //int[] testArr = {8,1,6,4,0,3,9,5};
        int[] randomArr = CREATE_RANDOM_ARR(100, 100);
        int[] sortedArr = QUICKSORT(randomArr,0,randomArr.length-1,0);
        System.out.println("QUICKSORTED = "+Arrays.toString(sortedArr));
    }
}
