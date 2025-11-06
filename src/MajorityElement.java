public class MajorityElement {
    public static int majorityElement(int[] arr){
        int count=1;
        int ele=arr[0];
        for(int i=1;i< arr.length;i++){
            if(count==0){
                ele=arr[i];
                count=1;
            }
            if(ele!=arr[i]){
                count--;
            }
            else{
                count++;
            }
        }
        count=0;
        for (int i = 0; i < arr.length; i++) {
            if(ele==arr[i]){
                count++;
            }
            if(count > arr.length/2){
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,2,2,3,4,9,9};
        System.out.println(majorityElement(arr));
    }
}
