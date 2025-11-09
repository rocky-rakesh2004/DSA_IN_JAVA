import java.util.ArrayList;
public class UnionOfSortedArray {
        public static ArrayList<Integer> findUnion(int[] a, int[] b) {
            ArrayList<Integer> result = new ArrayList<>();
            int i = 0, j = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    addUnique(result, a[i]);
                    i++;
                } else if (b[j] < a[i]) {
                    addUnique(result, b[j]);
                    j++;
                } else {
                    addUnique(result, a[i]);
                    i++;
                    j++;
                }
            }

            while (i < a.length) {
                addUnique(result, a[i]);
                i++;
            }

            while (j < b.length) {
                addUnique(result, b[j]);
                j++;
            }

            return result;
        }

        private static void addUnique(ArrayList<Integer> result, int value) {
            if (result.isEmpty() || result.get(result.size() - 1) != value) {
                result.add(value);
            }
        }

    public static void main(String[] args) {
            int[] arr1={1,2,3,4,4,5,6,7};
            int[] arr2={6,7,8,9,10};
        System.out.println(findUnion(arr1,arr2));
    }
}
