public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int sum=0, max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,-2,3,-9,8,7,-7};
        System.out.println(maxSubarraySum(arr));
    }
}
