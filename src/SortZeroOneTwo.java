public class SortZeroOneTwo{
        // Function to sort array containing only 0s, 1s, and 2s
        public static void sort012(int[] arr) {
            int n = arr.length;
            int start = 0, mid = 0, end = n - 1;

            while (mid <= end) {
                if (arr[mid] == 0) {
                    swap(arr, start, mid);
                    start++;
                    mid++;
                } else if (arr[mid] == 1) {
                    mid++;
                } else { // arr[mid] == 2
                    swap(arr, mid, end);
                    end--;
                }
            }
        }

        // Swap helper function
        private static void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        // Main method to test the function
        public static void main(String[] args) {
            int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1};

            System.out.println("Before sorting:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            sort012(arr);

            System.out.println("\nAfter sorting:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


