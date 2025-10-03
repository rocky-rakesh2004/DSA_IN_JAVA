import java.util.Scanner;

class LinearSearch{
    public static int linearSearch(int[] arr,int key){
        int len= arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a size of an array: ");
        int size = get.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a key to be searched: ");
        int key = get.nextInt();
        System.out.println("Enter an array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();
        }
        int result = linearSearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("The element " + key + " found at the index: " + result);
        }
    }
}