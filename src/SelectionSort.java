import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[] arr={21,6,9,0,23,2,-1,7};
        System.out.println("Before sort: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sort: "+ Arrays.toString(arr));
    }
}
