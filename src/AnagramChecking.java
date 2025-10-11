public class AnagramChecking {
    static boolean isAnagram(String str1, String str2){
        String s1=str1.toLowerCase(),s2=str2.toLowerCase();
        int[] freq=new int[26];
        int index=0;

        if (s1.length() != s2.length()) return false;

        for (char ch:s1.toCharArray()) {
            if((ch>='a')&&(ch<='z')){
            index=ch-'a';
            freq[index]++;
        }
        }

        for (char ch:s2.toCharArray()) {
            if ((ch >= 'a') && (ch <= 'z')) {
                index = ch - 'a';
                freq[index]--;
            }
        }
        for(int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="eat",s2="ate";
        System.out.println(isAnagram(s1,s2));
    }
}
