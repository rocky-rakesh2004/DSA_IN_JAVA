public class ZigZagString {
    public static String zigZagString(String s,int numRows){
        StringBuilder[] str=new StringBuilder[numRows];
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            str[i]=new StringBuilder();
        }
        int in=0,st=1;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(in==0){
                st=1;
            } else if (in==numRows-1) {
                st=-1;
            }
            str[in].append(ch);
            in+=st;
        }
        for (StringBuilder sb:str) {
            result.append(sb);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(zigZagString(s,4));
    }
}
