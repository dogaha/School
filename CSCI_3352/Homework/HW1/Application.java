package CSCI_3352.Homework.HW1;
import java.util.Arrays;
import java.util.Random;

public class Application {
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
        System.out.println("UNSORTED:\n"+Arrays.toString(randomArr)+"\n");

        //Heap Sort
        long startTime = System.nanoTime();
        int[] heapArr = Heapsort.HEAPSORT(randomArr);
        long endTime = System.nanoTime();
        
        System.out.println("HEAPSORTED:\n"+Arrays.toString(heapArr));
        System.out.printf("Elasped Time: %d ns\n\n",endTime - startTime); // Elapsed time in milliseconds

        //Quick Sort
        startTime = System.nanoTime();
        int[] quickArr = Quicksort.QUICKSORT(randomArr,0,randomArr.length-1,0);
        endTime = System.nanoTime();

        System.out.println("QUICKSORTED:\n"+Arrays.toString(quickArr));
        System.out.printf("Elapsed Time: %d ns\n\n",endTime - startTime); // Elapsed time in milliseconds
        
        System.out.print("Heapsort Array and Quicksort Array are ");
        if (quickArr == heapArr) {System.out.println("EQUIVALENT!");}
        else {System.out.println("NOT EQUIVALENT!");}

    }
}
