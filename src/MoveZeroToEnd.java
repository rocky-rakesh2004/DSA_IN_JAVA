import java.util.Arrays;

public class MoveZeroToEnd {

    public static void moveZeroToEnd(int[] arr){
        int len= arr.length;
        int index=0;
        for (int i = 0; i < len; i++) {
            if(arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<len){
            arr[index++]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,0,32,-9,0,0,8,0,1,3,0};
        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }
}
