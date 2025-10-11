import java.util.Locale;

public class PanagramChecking {
    static boolean isPanagram(String str){
        boolean[] freq=new boolean[26];
        int index;
        str=str.toLowerCase();
        if(str.length()<26){
            return false;
        }
        for(char ch:str.toCharArray()){
            if((ch>='a')&&(ch<='z')){
                index=ch-'a';
                freq[index]=true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(!freq[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuwwxyz";
        System.out.println(isPanagram(str));
    }
}
