import java.util.HashMap;

public class LongestSubArray {
    public static int longestSubArrayPositive(int[] arr,int num){
        //for sorted and positive only
        int left=0;
        int maxLen=0,sum=0;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
            if(sum==num){
                maxLen=Math.max(maxLen,right-left+1);
            }
            while (sum>num && left <= right){
                sum-=arr[left];
                left++;
            }
        }
        return maxLen;
    }

    public static int longestSubArrayGeneral(int[] arr,int num){
        //for both negative and positive
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,maxLen=0,rem=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            rem=sum-num;
            if (sum == num) {
                maxLen=Math.max(maxLen,i+1);
            }
            if(map.containsKey(rem)){
                maxLen=Math.max(maxLen,i-map.get(rem));
            }
            map.putIfAbsent(sum,i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1={10,5,2,7,1,9};
        int[] arr2={-1,0,3,1,-7,2};
        System.out.println(longestSubArrayPositive(arr1,15));
        System.out.println(longestSubArrayGeneral(arr2,-1));
    }
}
